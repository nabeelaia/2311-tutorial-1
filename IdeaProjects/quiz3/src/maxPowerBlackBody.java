
import java.util.ArrayList;
class maxPowerBlackBody {
    public static void report(ArrayList<blackBody> blackBodyList) {
        if (blackBodyList.isEmpty()) {
            System.out.println("No black bodies found.");
            return;
        }

        blackBody maxPowerBody = blackBodyList.get(0);
        for (int i = 1; i < blackBodyList.size(); i++) {
            blackBody currentBody = blackBodyList.get(i);
            if (currentBody.getPower() > maxPowerBody.getPower()) {
                maxPowerBody = currentBody;
            }
        }

        System.out.println("Black body with maximum emitted radiation power:");
        System.out.println("Name: " + maxPowerBody.getName());
        System.out.println("Radiation Power: " + maxPowerBody.getPower());
    }
}

class blackBody {
    private String name;
    private double power;
    private double temperature;
    private double wavelength;


    public blackBody(String name, double power, double temperature, double wavelength) {
        this.name = name;
        this.power = power;
        this.temperature = temperature;
        this.wavelength = wavelength;

    }

    public String getName() {
        return name;
    }

    public double getPower() {
        return power;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getWavelength() {
        return wavelength;
    }
}

