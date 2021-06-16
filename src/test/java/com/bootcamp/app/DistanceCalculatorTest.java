package com.bootcamp.app;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DistanceCalculatorTest {

    @Test
    public void testGetOneDimensionalDistance() {
        assertEquals(5.3, DistanceCalculator.getOneDimensionalDistance(10.7, 5.4), 0.001);
    }

    @Test
    public void testGetPythagoreanDistance() {
        assertEquals(1.5, DistanceCalculator.getPythagoreanDistance(1.2, 0.9), 0.001);
    }

    @Test
    public void testGetDistance() {
        assertEquals(Math.sqrt(34), DistanceCalculator.getDistance(5, 7, 8, 2), 0.001);
    }
}
