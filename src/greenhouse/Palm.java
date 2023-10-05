package greenhouse;

// Klass som representerar en palmväxt och ärver från Plant.
class Palm extends Plant {
    public Palm(String name, double height) {
        // Använder super för att anropa konstruktorn Plant.
        super(name, height);
    }

    // Implementering av metoden från WateringInterface-gränssnittet.
    @Override
    public double getWaterAmount() {
        return 0.5 * getHeight();
    }

    // Implementering av metoden från WateringInterface-gränssnittet.
    @Override
    public LiquidType getLiquidType() {
        return LiquidType.WATER;
    }
}