package ua.edu.ucu.apps.lab8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.flower.flower.store.Flower;
import ua.edu.ucu.apps.flower.flower.store.FlowerColor;
import ua.edu.ucu.apps.flower.flower.store.FlowerType;
import ua.edu.ucu.apps.flower.flower.store.Item;
import ua.edu.ucu.apps.flower.flower.store.RibbonDecorator;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RibbonDecoratorTest {

    private Item flower;
    private RibbonDecorator ribbonFlower;

    @BeforeEach
    void setUp() {
        flower = new Flower(FlowerColor.BLUE, 100, 12, FlowerType.ROSE);
        ribbonFlower = new RibbonDecorator(flower);
    }

    @Test
    void testGetPrice() {
        double expectedPrice = 110;
        assertEquals(expectedPrice, ribbonFlower.getPrice());
    }

    @Test
    void testGetDescription() {
        String expectedDescription = "Simple ItemItem with ribbon";
        assertEquals(expectedDescription, ribbonFlower.getDescription());
    }
}
