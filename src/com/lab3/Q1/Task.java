package com.lab3.Q1;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Task {

        public static double roundToNearestHundredth(BigDecimal number) {

            return number.setScale(2, RoundingMode.HALF_UP).doubleValue();
        }

        public static void main(String[] args) {
            BigDecimal inputNumber = new BigDecimal("4.2545");
            double roundedNumber = roundToNearestHundredth(inputNumber);

            System.out.println("Original BigDecimal: " + inputNumber);
            System.out.println("Rounded to nearest hundredth: " + roundedNumber);
        }

}
