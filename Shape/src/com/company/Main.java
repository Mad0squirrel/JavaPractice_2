package com.company;

public class Main {

    public static void main(String[] args) {
        Shape cube = new Shape("cube","small","white", 6);
        Shape pyramid = new Shape("pyramid", "large", "yellow", 5);
        System.out.println(cube);
        System.out.println(pyramid);
    }
}
