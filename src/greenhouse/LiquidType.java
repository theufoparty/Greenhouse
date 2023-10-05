package greenhouse;
// Enum-klass som definierar olika typer av vätska som växterna kan få.
enum LiquidType {
    WATER("kranvatten"),
    PROTEIN_DRINK("proteindryck"),
    MINERAL_WATER("mineralvatten");

    private final String description;

    // Konstruktor för att sätta beskrivningen av vätsketypen.
    LiquidType(String description) {
        this.description = description;
    }

    // Getter-metod för att hämta beskrivningen av vätsketypen.
    public String getDescription() {
        return description;
    }
}
