package com.lab3.Q4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

       IntArrayList list1 = new IntArrayList();
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

        System.out.println(list1.get(4));
     System.out.println(list1.get(10));
     IntVector list2 = new IntVector();
        list2.add(65);
        list2.add(26) ;
        list2.add(632);
        list2.add(77);
        list2.add(94);
        list2.add(66);
        list2.add(671);
        list2.add(86);
        list2.add(36);
        list2.add(63);
        list2.add(66);
        list2.add(43);
        list2.add(65);
        list2.add(6);
        System.out.println(list2.get(6));
        System.out.println(list2.get(20));

    }
    }
