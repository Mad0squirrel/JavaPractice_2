package com.company;

public class Dog {
    private String name;
    private  int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog(String n) {
        name = n;
        age = 0;
    }
    public Dog() {
        name = "Sharik";
        age = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Dog{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
    public String intoHumanAge() {
        return name + "'s age in human years is " + age*7 + " years.";
    }
}
