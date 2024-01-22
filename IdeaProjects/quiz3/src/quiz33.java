import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
public class quiz33 {
    public static <var> void main(String[] args) {
        try {
            var blackBodyInput = (var) new File("//cs/home/nabeela1/BlackBodies.csv");
            ArrayList<blackBody> blackBodyList;
            try (Scanner input = new Scanner((File) blackBodyInput)) {
                blackBodyList = new ArrayList<blackBody>();
                int i = 0;
                while (input.hasNext()) {
                    String eachLine = input.nextLine();
                    String[] eachBody = eachLine.split(",");
                    blackBodyList.add(new blackBody(eachBody[0], Double.parseDouble(eachBody[1]),
                            Double.parseDouble(eachBody[2]), Double.parseDouble(eachBody[3])));
                }
            }
            maxPowerBlackBody.report(blackBodyList);
        } catch (Exception e) {
            System.out.println("File reading exception" + e);
        }
        double value = 5.67 * Math.pow(10, -8);
        System.out.println("Stefans constant is"+value);

    }
}