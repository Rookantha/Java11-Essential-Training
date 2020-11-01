package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* before refactor
        var sc = new Scanner(System.in);

        System.out.print("Enter a numeric value: ");
        var d1 = sc.nextDouble();

        System.out.print("Enter a numeric value: ");
        var d2 = sc.nextDouble();

        double result = d1 / d2;

        System.out.println("The answer is " + result);

        */


        var sc = new Scanner(System.in);

        double d1 = getInput(sc, "Enter Numeric value 1 ");

        double d2 = getInput(sc,"Enter Numeric value 2 ");

        double result = d1 / d2;


        System.out.println("The answer is " + result);
    }

    private static double getInput(Scanner sc, String prompt) {
        System.out.print(prompt);
        return sc.nextDouble();
    }
}
