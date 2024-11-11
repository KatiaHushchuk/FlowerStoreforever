package ua.edu.ucu.apps.lab8;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import ua.edu.ucu.apps.flowerstore.model.Flower;

class FlowerTest {

    @Test
    void testFlowerProperties() {
        
        Flower flower = new Flower();
        flower.setName("Lily");
        flower.setColor("White");
        flower.setPrice(2.50);
        flower.setAvailable(true);

        assertEquals("Lily", flower.getName());
        assertEquals("White", flower.getColor());
        assertEquals(2.50, flower.getPrice());
        assertTrue(flower.isAvailable());
    }
}
