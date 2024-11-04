package ua.edu.ucu.apps.lab8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.flower.flower.store.BasketDecorator;
import ua.edu.ucu.apps.flower.flower.store.Flower;
import ua.edu.ucu.apps.flower.flower.store.FlowerColor;
import ua.edu.ucu.apps.flower.flower.store.FlowerType;
import ua.edu.ucu.apps.flower.flower.store.Item;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BasketDecoratorTest {

    private Item flower;
    private BasketDecorator basketFlower;

    @BeforeEach
    void setUp() {
        flower = new Flower(FlowerColor.RED, 100, 15, FlowerType.ROSE);
        basketFlower = new BasketDecorator(flower);
    }

    @Test
    void testGetPrice() {
        double expectedPrice = 120;
        assertEquals(expectedPrice, basketFlower.getPrice());
    }

    @Test
    void testGetDescription() {
        String expectedDescription = "Simple Item, in a basket";
        assertEquals(expectedDescription, basketFlower.getDescription());
    }
}
