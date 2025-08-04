package com.codewithraj;


import javax.swing.text.NumberFormatter;
import java.text.NumberFormat;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.print("Welcome to Raj Code Universe");
        System.out.println();
        DataTypes data = new DataTypes();
        data.informationPrint();

        //StringExample
        StringExamples stringExamples = new StringExamples();
        stringExamples.printMessage();

        //escape sequence
        System.out.println("Hello \"Raj\"");
        System.out.println("Hello \n world");

        //Arrays
        ArrayExample arrayExample = new ArrayExample();
        arrayExample.printArray();

        //multidimensional arrays
        int [][] numbers=new int[2][3];
        numbers[0][0]=2;

        System.out.println(Arrays.deepToString(numbers)); // to print multi dimensional arrays


        //Math class
        double x = 1.2;
        System.out.println(Math.ceil(x));
        System.out.println(Math.floor(x));
        System.out.println(Math.max(2,3));
        System.out.println(Math.min(2,3));
        System.out.println((int)(Math.random()*100));


        //format

        System.out.println(NumberFormat.getInstance().format(13782687));
        System.out.println(NumberFormat.getCurrencyInstance().format(13782687));


    }
}