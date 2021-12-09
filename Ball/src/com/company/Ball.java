package com.company;

public class Ball {
    private int radius;
    private String color;


    public Ball(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getVolume() {
        return (4 * 3.14 * radius * radius) / 3;
    }

    public String toString() {
        return "Ball{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
