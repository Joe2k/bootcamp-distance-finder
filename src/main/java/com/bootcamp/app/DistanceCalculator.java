package com.bootcamp.app;

public class DistanceCalculator {

    public static double getOneDimensionalDistance(double p1, double p2) {
        return Math.abs(p2 - p1);
    }

    public static double getPythagoreanDistance(double a, double b) {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    public static double getDistance(double x1, double y1, double x2, double y2) {
        double horizontalDistance = getOneDimensionalDistance(x1, x2);
        double verticalDistance = getOneDimensionalDistance(y1, y2);
        return getPythagoreanDistance(horizontalDistance, verticalDistance);
    }
}
