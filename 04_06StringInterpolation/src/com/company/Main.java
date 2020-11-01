package com.company;

public class Main {

    public static void main(String[] args) {
        var item = "Shirt";
        var size = "M";
        var price = 14.99;
        var color = "Red";

        var name= "rookantha";
        var age = 25;
        var height = 5.32;
        var skinColor = "white";



        var template = "Clothing item:%s, size %s, color %s, $%2f";
        var itemSting = String.format(template,
                item,size,color,price);
        System.out.println(itemSting);

        var type = "Clothing item:%s, age : %s, Skin Color: %s, height :%2f";
        var typeString = String.format(type,
                name,age,skinColor,height);
        System.out.println(typeString);

    }
}
