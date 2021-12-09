package com.company;

public class Shape {

    public String name;
    public String size;
    public String color;
    public int sides;

    public Shape(String name, String size, String color, int sides) {
        this.name = name;
        this.size = size;
        this.color = color;
        this.sides = sides;
    }


    public String toString() {
        return "Shape{name='" + name + '\''
                + ", size='" + size + '\''
                + ", color='" + color + '\''
                + ", sides=" + sides + '}';
    }

}
