package greenhouse;

// Gränssnitt som definierar metoder för att hantera vattning av växter.
interface WateringInterface {
    double getWaterAmount();
    LiquidType getLiquidType();
}