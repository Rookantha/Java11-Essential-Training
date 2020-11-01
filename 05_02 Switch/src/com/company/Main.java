package com.company;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        var now = LocalDateTime.now();
        var monthNumber = now.getMonthValue();

        switch (monthNumber) {
            case 1:
                System.out.println("this month is jan");
                break;
            case 2:
                System.out.println("this month is feb");
                break;
            case 3:
                System.out.println("this month is march");
                break;

//            case 9:
//            case 10:
//            case 11:
//            also work as same
            case 9,10,11:
                System.out.println("that important Switch case");
                break;
            default:
                System.out.println("chose another month ");

        }
    }
}
