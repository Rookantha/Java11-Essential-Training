package com.company;

import java.text.NumberFormat;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        var doubleValue = 10_000_000.53;

        var numF= NumberFormat.getInstance();
        System.out.println("Number " + numF.format(doubleValue));

        var intF= NumberFormat.getIntegerInstance();
        System.out.println("Number " + intF.format(doubleValue));

        intF.setGroupingUsed(false);
        System.out.println("Number" + intF.format(doubleValue));

        var locale = Locale.getDefault();
        var localeFormatter = NumberFormat.getInstance(locale);
        System.out.println("Number" + localeFormatter.format(doubleValue));

        var locale1 = new Locale("de","DE");
        var localeFormatter1 = NumberFormat.getInstance(locale1);
        System.out.println("Number" + localeFormatter1.format(doubleValue));

        var currencyFormatter = NumberFormat.getCurrencyInstance();
        System.out.println(currencyFormatter.format(doubleValue));


    }
}
