package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class DogKennel {

    public static void AddAnElement(ArrayList<Dog> newList) {

        Scanner sc = new Scanner(System.in);
        Dog d1 = new Dog();
        System.out.println("Введите имя собаки: ");
        d1.setName(sc.nextLine());
        System.out.println("Введите возраст собаки: ");
        d1.setAge(sc.nextInt());
        newList.add(newList.size(), d1);
        System.out.println(newList);
    }

    public static void main(String[] args) {
         Dog dachshund = new Dog("Dina", 14);
        Dog labrador = new Dog("Tom", 3);
        Dog bulldog = new Dog("Gabriella", 1);

        ArrayList<Dog> list = new ArrayList<>();
        list.add(0, dachshund);
        list.add(1, labrador);
        list.add(2, bulldog);
        
        Scanner k = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.println("Добавить новый объект? \n1.Да\n2.Нет" );
            switch (k.nextInt()) {
                case (1):
                    AddAnElement(list);
                    break;
                case (2):
                    System.out.println(list);
                    run = false;
                    break;
                default:
                    break;
            }
        }
    }
}
