package Växthotell;

class CarnivorousPlant extends Plant {
    public CarnivorousPlant(String name, double height) {
        super(name, height);
    }

    @Override
    public double getWaterAmount() {
        return 0.1 + (0.2 * getHeight());
    }

    @Override
    public LiquidType getLiquidType() {
        return LiquidType.PROTEIN_DRINK;
    }
}

