package com.company;

public class Main {
    public static void main(String[] args) {
        var s1 = "Welcome to California!";
        System.out.println("length of string: " + s1.length());

        int position = s1.indexOf("California");
        System.out.println("The position is " + position);

        var sub = s1.substring(11);
        System.out.println(sub);

        String s2 = "Welcome!      ";
        var len = s2.length();
        System.out.println(len);
        var trimmed = s2.trim();
        System.out.println(trimmed.length());
    }



//        public static void concat1(String s1)
//        {
//            s1 = s1 + "forgeeks";
//        }
//
//        // Concatenates to StringBuilder
//        public static void concat2(StringBuilder s2)
//        {
//            s2.append("forgeeks");
//        }
//
//        // Concatenates to StringBuffer
//        public static void concat3(StringBuffer s3)
//        {
//            s3.append("forgeeks");
//        }
//
//        public static void main(String[] args)
//        {
//            String s1 = "Geeks";
//            concat1(s1);  // s1 is not changed
//            System.out.println("String: " + s1);
//
//            StringBuilder s2 = new StringBuilder("Geeks");
//            concat2(s2); // s2 is changed
//            System.out.println("StringBuilder: " + s2);
//
//            StringBuffer s3 = new StringBuffer("Geeks");
//            concat3(s3); // s3 is changed
//            System.out.println("StringBuffer: " + s3);
//
//
//        }

}
