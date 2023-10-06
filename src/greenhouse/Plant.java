package greenhouse;
// Abstrakt klass som representerar en grundläggande växt.
// Som implementerar WateringInterface, vilket innebär att alla klasser som ärver
// Plant måste implementera de metoder som WateringInterface har.
abstract class Plant implements WateringInterface {
    private String name;
    private double height;

    // Konstruktor för att skapa en ny växt.
    public Plant(String name, double height) {
        this.name = name;
        this.height = height;
    }

    // Getter-metod för att hämta växtens namn.
    public String getName() {
        return name;
    }

    // Getter-metod för att hämta växtens höjd.
    public double getHeight() {
        return height;
    }
}