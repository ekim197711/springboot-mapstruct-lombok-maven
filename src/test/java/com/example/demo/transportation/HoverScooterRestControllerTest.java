package com.example.demo.transportation;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class HoverScooterRestControllerTest {
    @Autowired
    HoverScooterRestController hoverScooterRestController;

    @Test
    public void scooter() {
        HoverScooter scooter = hoverScooterRestController.scooter();
        System.out.println(scooter);
        assertEquals("Mike", scooter.getMadeforalien());
        assertEquals(2500.0d, scooter.getMaxSpeed());
        assertEquals("T800_SlimyAlien", scooter.getModel());
    }
}