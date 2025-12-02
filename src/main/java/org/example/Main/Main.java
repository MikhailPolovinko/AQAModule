package org.example.Main;

import org.example.Car.Car;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Car ferrari = new Car();

        int[] integers = new int[4];
        integers[0] = 1;
        integers[1] = 2;
        integers[2] = 3;
        integers[3] = 4;

        int[] numbers = {1, 2, 3, 4, 5};

        List<String> names = new ArrayList<>();
        names.add("Mikhail");
        names.add("Sasha");
        names.add("Nikita");

        checkintegers(integers[1]);
    }

    public static void checkintegers(int test) {
        if (test == 2) {
            System.out.println("It's correct number");
        } else {
            System.out.println("Wrong number");
        }
    }
}