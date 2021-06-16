package com.bootcamp.app;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DistanceCalculatorTest {

    @Test
    public void testGetOneDimensionalDistance() {
        assertEquals(5.3, DistanceCalculator.getOneDimensionalDistance(10.7, 5.4), 0.001);
    }
}
