package Växthotell;

public enum LiquidType {
    WATER("kranvatten"),
    PROTEIN_DRINK("proteindryck"),
    MINERAL_WATER("mineralvatten");

    private final String description;

    LiquidType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}


