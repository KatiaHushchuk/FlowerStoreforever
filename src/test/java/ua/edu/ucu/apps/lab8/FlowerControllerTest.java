package ua.edu.ucu.apps.lab8;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import ua.edu.ucu.apps.lab8.controller.FlowerController;
import ua.edu.ucu.apps.lab8.model.Flower;
import ua.edu.ucu.apps.lab8.service.FlowerService;

class FlowerControllerTest {

    @Mock
    private FlowerService flowerService;

    @InjectMocks
    private FlowerController flowerController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetFlowers() {
        Flower flower1 = new Flower();
        flower1.setName("Rose");
        Flower flower2 = new Flower();
        flower2.setName("Tulip");
        when(flowerService.getFlowers()).thenReturn(Arrays.asList(flower1, flower2));
        assertEquals(2, flowerController.getFlowers().size());
    }

    @Test
    void testCreateFlower() {
        Flower flower = new Flower();
        flower.setName("Lily");
        when(flowerService.createFlower(any(Flower.class))).thenReturn(flower);
        Flower createdFlower = flowerController.creatFlower(flower);
        assertEquals("Lily", createdFlower.getName());
    }
}
