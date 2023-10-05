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
}
