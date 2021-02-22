package com.tematihonov;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        System.out.println("Lesson 11\nЗадан массив: ");
        int[] startArray = new int[]{1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(startArray));

        //Task 2
        System.out.println("Task 2\nТрансформация к ArrayList: ");
        List transformedArray = transformArrayToArrayList(startArray);
        System.out.println(transformedArray);

        //Task 1
        System.out.println("Task 1\nArrayList после замены двух элементов: ");
        List arrayWithChangeOfIndexes = changeIndexes(transformedArray, 0, 4);
        System.out.println(arrayWithChangeOfIndexes);


        //Task 3
        System.out.println("Task 3");
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();

        Box<Apple> appleBox = new Box<>(apple1, apple2, apple3);
        Box<Orange> orangeBox = new Box<>(orange1, orange2);

        System.out.println(appleBox.getWeight());
        System.out.println(orangeBox.getWeight());
        System.out.println(appleBox.compare(orangeBox));

        Box<Apple> appleBox2 = new Box<>();
        appleBox.changeBox(appleBox2);

        System.out.println(appleBox2.getWeight());
    }

    public static List changeIndexes(List list, int a, int b) {
        int firstValue = (int) list.get(a);
        int secondValue = (int) list.get(b);
        list.set(a, secondValue);
        list.set(b, firstValue);
        return list;
    }

    public static List transformArrayToArrayList(int[] array) {
        List transformedArray = new ArrayList();
        for (int i = 0; i < array.length; i++) {
            transformedArray.add(array[i]);
        }
        return  transformedArray;
    }
}