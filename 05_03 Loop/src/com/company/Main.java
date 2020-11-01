package com.company;

public class Main {

    public static void main(String[] args) {
        String[] months =
                {"January", "February", "March",
                        "April", "May", "June",
                        "July", "August", "September",
                        "October", "November", "December"};
        //iterative Loop

//        for (String month : months) {
//            System.out.println(month);
//
//
//        }

        /*

        for (var month : months){
            System.out.println(month);
        }

         */

        /*
        var whileCounter = 0;
        while (whileCounter < months.length){
            System.out.println(months[whileCounter]);
            whileCounter ++;
        }

         */

        var doCounter = 0;
        do {
            System.out.println(months[doCounter]);
            doCounter ++;
        }while (doCounter < months.length);
    }
}
