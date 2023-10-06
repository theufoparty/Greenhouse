package greenhouse;
import java.util.Scanner;

public class InteractiveGreenHouse {
    public static void main(String[] args) {
        // Skapa en instans av Scanner för att ta emot användarens input.
        try (Scanner scanner = new Scanner(System.in)) {
            // Be användaren ange namnet på den växt man vill vattna.
            System.out.print("Vilken växt ska få vätska? Ange växtens namn: ");
            String plantName = scanner.nextLine();

            // Skapar en array med olika växttyper.
            Plant[] availablePlants = {
                    new Cactus("Igge", 0.2),
                    new Palm("Laura", 5.0),
                    new CarnivorousPlant("Meatloaf", 0.7),
                    new Palm("Olof", 1.0)
            };

            // Jag börjar med att sätta den här flaggan till false, när jag hittar plantan så sätts den till true.
            boolean found = false;

            // Loopa igenom arrayen med växttyper.
            for (Plant availablePlant : availablePlants) {
                // Jämför användarens angivna namn med namnet på växten.
                if (availablePlant.getName().equalsIgnoreCase(plantName)) {
                    // Anropa polymorfa metoder för att hämta vattenmängd och vätsketyp.
                    double waterAmount = availablePlant.getWaterAmount();
                    LiquidType liquidType = availablePlant.getLiquidType();

                    // Visa information om hur mycket vatten och vilken typ av vätska växten behöver.
                    System.out.println(availablePlant.getName() + " ska vattnas med " + waterAmount + " liter " + liquidType.getDescription());

                    // Markera att vi har hittat växten.
                    found = true;

                    // Avsluta loopen.
                    break;
                }
            }

            // Om ingen matchning hittas, skriv ut felmeddelandet:
            if (!found) {
                System.out.println("Växten med namnet \"" + plantName + "\" hittades inte på hotellet.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
