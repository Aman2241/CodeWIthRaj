package com.codewithraj;

public class StringExamples {
    String message = "Hello World **";

    void printMessage()
    {
        System.out.println(message.toUpperCase()); // to make string to upper letters
        System.out.println(message.toLowerCase()); // to lower letters
        System.out.println(message.charAt(0)); // to view char at specific position
        System.out.println(message.length()); //length of string
        System.out.println(message.replace("*", "|"));
        System.out.println(message); //original string will not change because its immutable
    }
}
