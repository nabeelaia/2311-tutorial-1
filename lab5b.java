import org.firmata4j.firmata.*;
import org.firmata4j.IODevice;
import org.firmata4j.Pin;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class lab5b {
    static String recLog = "\"/dev/cu.usbserial-0001\"";
    static IODevice myGroveBoard;


    public static void process() throws IOException {
        String myPort = "/dev/cu.usbserial-0001";
        myGroveBoard = new FirmataDevice(myPort);


        Date now;
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        now = Calendar.getInstance().getTime();
        recLog += dateFormat.format(now) + " Starting the watering process.\n";


        try {
            myGroveBoard.start();
            System.out.println("Arduino Board Started for Watering Process.");
            myGroveBoard.ensureInitializationIsDone();
        } catch (IOException ex) {
            System.out.println("Couldn't connect to the Arduino board.");
            return;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        var motor = myGroveBoard.getPin(7);
        motor.setMode(Pin.Mode.OUTPUT);
        var sensor = myGroveBoard.getPin(16);
        sensor.setMode(Pin.Mode.ANALOG);


        int dryThreshold = 300;
        boolean executing = true;


        while (executing) {
            int value = (int) sensor.getValue();


            if (value >= dryThreshold) {
                recLog += dateFormat.format(Calendar.getInstance().getTime()) + " The moisture level is " + value + ".\n";
                recLog += dateFormat.format(Calendar.getInstance().getTime()) + " The moisture level is low, watering for 2 seconds.\n";
                motor.setValue(1);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                motor.setValue(0);
            } else {
                recLog += dateFormat.format(Calendar.getInstance().getTime()) + " The moisture level is sufficient after " + recLog.lines().filter(s -> s.contains("watering for")).count() * 2 + " seconds of watering.\n";
                executing = false;
            }


            try {
                Thread.sleep(20000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        myGroveBoard.stop();
        recLog += "Arduino Board Stopped. End of Watering Process.\n";
        processLog(recLog);
    }


    public static void processLog(String log) {
        System.out.println(log);
    }
}



