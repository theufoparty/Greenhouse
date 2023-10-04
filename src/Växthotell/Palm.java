package Växthotell;

class Palm extends Plant {
    public Palm(String name, double height) {
        super(name, height);
    }

    @Override
    public double getWaterAmount() {
        return 0.5 * getHeight();
    }

    @Override
    public LiquidType getLiquidType() {
        return LiquidType.WATER;
    }
}