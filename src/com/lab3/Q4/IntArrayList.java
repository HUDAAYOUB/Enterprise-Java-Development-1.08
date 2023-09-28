package com.lab3.Q4;

public class IntArrayList implements IIntList {
    private int[] array;
    private int size;

    public IntArrayList(int[] array) {
        this.array = array;
        this.size = 0;
    }

    public int[] getArray() {
        return this.array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void add(int number) {
        if (size == array.length) {
            int[] newarray = new int[(int) (array.length * 1.5)];
            System.out.println("length of the old array is :  " + "\n"+ array.length);
            System.out.println("length of new array is :" + newarray.length);
            for (int i = 0; i < array.length; i++) {
                System.out.println("the value of the new array before:  "+ "\n" + array.length);
                newarray[i] = array[i];
                System.out.println("increasing the array after " + "\n"+ newarray.length);

            }
        } else {
            System.out.println("There is an error" + number);
            array[size] = number;
            size++;
        }


    }


        @Override
        public int get ( int id){
            return id;
        }
}
