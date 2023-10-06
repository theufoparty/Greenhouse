package greenhouse;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PlantTest {

    @Test
    void getName() {
        Plant plant = new Cactus("Igge", 0.2);
        assertEquals("Igge", plant.getName());
    }

    @Test
    void getHeight() {
        Plant plant = new Cactus("Igge", 0.2);
        assertEquals(0.2, plant.getHeight(), 0.001);
    }

    @Test
    public void testPalmWaterAmount() {
        Plant palm = new Palm("Laura", 5.0);
        double expectedWaterAmount = 0.5 * palm.getHeight();
        assertEquals(expectedWaterAmount, palm.getWaterAmount(), 0.001); // Tolerans av 0.001 för flyttalsjämförelse
    }

    @Test
    public void testPalmLiquidType() {
        Plant palm = new Palm("Laura", 5.0);
        assertEquals(LiquidType.WATER, palm.getLiquidType());
    }

    @Test
    public void testCactusWaterAmount() {
        Plant cactus = new Cactus("Igge", 0.2);
        assertEquals(0.02, cactus.getWaterAmount(), 0.001); // Tolerans av 0.001 för flyttalsjämförelse
    }

    @Test
    public void testCactusLiquidType() {
        Plant cactus = new Cactus("Igge", 0.2);
        assertEquals(LiquidType.MINERAL_WATER, cactus.getLiquidType());
    }

    @Test
    public void testCarnivorousPlantWaterAmount() {
        Plant carnivorousPlant = new CarnivorousPlant("Meatloaf", 0.7);
        double expectedWaterAmount = 0.1 + (0.2 * carnivorousPlant.getHeight());
        assertEquals(expectedWaterAmount, carnivorousPlant.getWaterAmount(), 0.001); // Tolerans av 0.001 för flyttalsjämförelse
    }

    @Test
    public void testCarnivorousPlantLiquidType() {
        Plant carnivorousPlant = new CarnivorousPlant("Meatloaf", 0.7);
        assertEquals(LiquidType.PROTEIN_DRINK, carnivorousPlant.getLiquidType());
    }
}
