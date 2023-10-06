package greenhouse;
// Enum-klass som definierar olika typer av vätska som växterna kan få.
// Dom kapitaliserade vätsketyperna är på engelska och används i koden av programmeraren,
// dessa ges en description via konstruktorn som används när vätskan presenteras för användaren
// via text i terminalen.
enum LiquidType {
    WATER("kranvatten"),
    PROTEIN_DRINK("proteindryck"),
    MINERAL_WATER("mineralvatten");

    private final String description;

    // Konstruktor för att sätta beskrivningen av vätsketypen.
    LiquidType(String description) {
        this.description = description;
    }

    // Getter-metod för att hämta beskrivningen av vätsketypen. Detta är ett exempel på att vi
    // enkapsulerar det privata fältet description från användaren av enumen LiquidType. Folk som använder enumen
    // kan inte referera direkt till descriptionen utan hämtar den via getDescription.
    public String getDescription() {
        return description;
    }
}
