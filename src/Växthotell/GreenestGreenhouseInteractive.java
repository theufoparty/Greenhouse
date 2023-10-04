package Växthotell;

import java.util.Scanner;

public class GreenestGreenhouseInteractive {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Vilken växt ska få vätska? Ange växtens namn: ");
        String plantName = scanner.nextLine();

        Plant[] plants = {
                new Cactus("Igge", 0.2),
                new Palm("Laura", 5.0),
                new CarnivorousPlant("Meatloaf", 0.7),
                new Palm("Olof", 1.0)
        };

        boolean found = false;

        for (Plant plant : plants) {
            if (plant.getName().equalsIgnoreCase(plantName)) {
                double waterAmount = plant.getWaterAmount();
                LiquidType liquidType = plant.getLiquidType();
                System.out.println(plant.getName() + " ska vattnas med " + waterAmount + " liter " + liquidType.getDescription());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Växten med namnet \"" + plantName + "\" hittades inte på hotellet.");
        }

        scanner.close();
    }
}
