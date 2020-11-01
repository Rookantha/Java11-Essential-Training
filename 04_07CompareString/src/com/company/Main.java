package com.company;

public class Main {

    public static void main(String[] args) {
        String s1 = "Hello!";
        var s2 = "Hello!";

        if(s1==s2){
            System.out.println("they match");

        }else{
            System.out.println("they don't match");
        }
        String s3 = new String("hello");
        String s4 = new String("hello !");
        //
        if(s3==s4){
            System.out.println("they match");

        }else{
            System.out.println("they don't match");
        }
        if(s3.equals(s4)){
            System.out.println("they match");

        }else{
            System.out.println("they don't match");
        }
        var s6= "HELLO !";

        if(s6.equalsIgnoreCase(s4)){
            System.out.println("they match");

        }else{
            System.out.println("they don't match");
        }



    }
}
