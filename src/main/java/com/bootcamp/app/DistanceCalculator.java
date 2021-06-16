package com.bootcamp.app;

public class DistanceCalculator {

    public static double getOneDimensionalDistance(double p1, double p2) {
        return Math.abs(p2 - p1);
    }

    public static double getPythagoreanDistance(double a, double b) {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }
}
