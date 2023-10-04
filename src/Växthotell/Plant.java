package Växthotell;

abstract class Plant implements WateringInterface {
    private final String name;
    private final double height;

    public Plant(String name, double height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }
}