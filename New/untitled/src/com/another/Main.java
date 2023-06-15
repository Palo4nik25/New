package com.another;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        Animal cat = new Animal("Rudy");
        Animal cat1 = new Animal("Bury");
        Animal cat2 = new Animal("Czarny");
        ArrayList<Animal> list1= new ArrayList<>();

        list1.add(cat);
        list1.add(cat1);
        list1.add(cat2);

        System.out.println("-----------");
        for (Animal k : list1) {
            System.out.println(k.getValues());
        }
        System.out.println("-----------");
        System.out.println((list1.get(2)).getValues());
        System.out.println(System.currentTimeMillis() - start + " ms");
    }
}
