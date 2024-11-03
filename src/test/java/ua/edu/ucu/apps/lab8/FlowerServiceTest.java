package ua.edu.ucu.apps.lab8;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import ua.edu.ucu.apps.lab8.model.Flower;
import ua.edu.ucu.apps.lab8.repository.FlowerRepository;
import ua.edu.ucu.apps.lab8.service.FlowerService;

class FlowerServiceTest {

    @Mock
    private FlowerRepository flowerRepository;

    @InjectMocks
    private FlowerService flowerService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetFlowers() {
        when(flowerRepository.findAll()).thenReturn(Arrays.asList(new Flower(), new Flower()));
        assertEquals(2, flowerService.getFlowers().size());
    }

    @Test
    void testCreateFlower() {
        Flower flower = new Flower();
        when(flowerRepository.save(any(Flower.class))).thenReturn(flower);
        assertEquals(flower, flowerService.createFlower(flower));
    }
}
