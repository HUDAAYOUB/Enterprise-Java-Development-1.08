package com.lab3.Q2;
public class mainCar {
    public static void main(String[] args) {

       UtilityVehicle UtilityV= new UtilityVehicle("HTYT", "Mercedes", "G-Class", 523,true);
       Saden saden = new Saden("FHTF", "Toyota", "Camry", 543);
        Truck Truck1 = new Truck("UHH756", "Toyota", "Tacoma", 4443,226547);

        System.out.println("TRUCK:"+ "\n" + Truck1.getInfo());
        System.out.println("SADEN :" + "\n " +saden.getInfo());
        System.out.println("UTILITYVEHICLE" + " \n" + UtilityV.getInfo());

    }}