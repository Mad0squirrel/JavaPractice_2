package com.company;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dog dachshund = new Dog("Dina", 14);
        Dog labrador = new Dog("Tom", 3);
        Dog bulldog = new Dog("Gabriella", 1);

        ArrayList<Dog> list = new ArrayList<>();
        list.add(0, dachshund);
        list.add(1, labrador);
        list.add(2, bulldog);

        Scanner sc = new Scanner(System.in);
        Dog d1 = new Dog();
        d1.setName(sc.nextLine());
        d1.setAge(sc.nextInt());
        list.add(3, d1);
        System.out.println("Введите что-нибудь: ");
        Scanner s = new Scanner(System.in);
        String string = s.nextLine();
        System.out.println("Вы ввели " + string);
    }
}
