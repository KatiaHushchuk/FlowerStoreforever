package ua.edu.ucu.apps.lab8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.flower.flower.store.Flower;
import ua.edu.ucu.apps.flower.flower.store.FlowerColor;
import ua.edu.ucu.apps.flower.flower.store.FlowerType;
import ua.edu.ucu.apps.flower.flower.store.Item;
import ua.edu.ucu.apps.flower.flower.store.PaperDecorator;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PaperDecoratorTest {

    private Item flower;
    private PaperDecorator paperFlower;

    @BeforeEach
    void setUp() {
        flower = new Flower(FlowerColor.RED, 100, 10, FlowerType.TULIP);
        paperFlower = new PaperDecorator(flower);
    }

    @Test
    void testGetPrice() {
        double expectedPrice = 107;
        assertEquals(expectedPrice, paperFlower.getPrice());
    }

    @Test
    void testGetDescription() {
        String expectedDescription = "Simple Item, wrapped in paper";
        assertEquals(expectedDescription, paperFlower.getDescription());
    }
}
