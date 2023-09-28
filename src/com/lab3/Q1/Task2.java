package com.lab3.Q1;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Task2 {
        public static BigDecimal reverseSignAndRoundToTenth(BigDecimal number) {

            BigDecimal negated = number.negate();
            BigDecimal rounded = negated.setScale(1, RoundingMode.HALF_UP); // Round to tenth
            return rounded;
        }
        public static void main(String[] args) {
            BigDecimal inputNumber1 = new BigDecimal("1.2345");
            BigDecimal inputNumber2 = new BigDecimal("-45.67");


            BigDecimal result1 = reverseSignAndRoundToTenth(inputNumber1);
            BigDecimal result2 = reverseSignAndRoundToTenth(inputNumber2);

            System.out.println("Original BigDecimal 1: " + inputNumber1);
            System.out.println("Result 1: " + result1);

            System.out.println("Original BigDecimal 2: " + inputNumber2);
            System.out.println("Result 2: " + result2);
        }

}
