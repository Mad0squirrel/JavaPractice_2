package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Ball b1 = new Ball(3, "Красный");
        System.out.println(b1);
        System.out.println("Объём шара = " + b1.getVolume());
    }
}
