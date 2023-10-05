package greenhouse;

// Klass som representerar en kaktusväxt och ärver från Plant.
class Cactus extends Plant {
    public Cactus(String name, double height) {
        // Använder super för att anropa konstruktorn Plant
        super(name, height);
    }

    // Implementering av metoden från WateringInterface-gränssnittet.
    @Override
    public double getWaterAmount() {
        return 0.02;
    }

    // Implementering av metoden från WateringInterface-gränssnittet.
    @Override
    public LiquidType getLiquidType() {
        return LiquidType.MINERAL_WATER;
    }
}
