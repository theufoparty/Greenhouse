package greenhouse;

// Klass som representerar en köttätande växt och ärver från Plant.
class CarnivorousPlant extends Plant {
    public CarnivorousPlant(String name, double height) {
        // Använder super för att anropa konstruktorn Plant
        super(name, height);
    }

    // Implementering av metoden från WateringInterface-gränssnittet.
    @Override
    public double getWaterAmount() {
        return 0.1 + (0.2 * getHeight());
    }

    // Implementering av metoden från WateringInterface-gränssnittet.
    @Override
    public LiquidType getLiquidType() {
        return LiquidType.PROTEIN_DRINK;
    }
}
