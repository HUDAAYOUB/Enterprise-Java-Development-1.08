package com.lab3.Q4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
       IntArrayList list1 = new IntArrayList(array);
        list1.add(6);
        list1.add(2);
        list1.add(6);
        list1.add(7);
        list1.add(9);
        list1.add(6);
        list1.add(1);
        list1.add(6);
        list1.add(6);
        list1.add(6);
        list1.add(7);
        list1.add(9);
        list1.add(6);
        list1.add(1);
        list1.add(6);
        list1.add(6);
        list1.add(6);
        list1.add(7);
        list1.add(9);
        list1.add(6);
        list1.add(1);
        list1.add(6);
        list1.add(6);
        list1.add(6);

        System.out.println(Arrays.toString(list1.getArray()));
        int[] array1 = new int[20];
        IntVector list2 = new IntVector(array);
        list2.add(6);
        list2.add(2);
        list2.add(6);
        list2.add(2);
        list2.add(6);
        list2.add(2);
        list2.add(6);
        list2.add(2);
        list2.add(6);
        list2.add(2);
        list2.add(6);
        list2.add(2);
        list2.add(6);
        list2.add(2);
        list2.add(6);
        list2.add(2);
        list2.add(6);
        list2.add(2);
        list2.add(6);
        list2.add(2);


        System.out.println(Arrays.toString(list2.getArray()));

    }
    }
