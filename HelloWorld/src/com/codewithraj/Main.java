package com.codewithraj;


import javax.swing.text.NumberFormatter;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

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


        //reading input
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = input.nextInt();
        System.out.println("Your age is "+age);

        final byte MONTH_IN_YEAR = 12;
        final byte PERCENT=100;
        //Mortgage calculator
        System.out.println("Please enter principal amount");
        double principalAmount = input.nextDouble();
        System.out.println("Please enter rate of interest");
        double yearlyInterest = input.nextDouble();
        yearlyInterest= yearlyInterest/PERCENT/MONTH_IN_YEAR; //monthly interest rate

        System.out.println("Please enter number of payments");
        int yearlyPaymentCount = input.nextInt();
        yearlyPaymentCount =yearlyPaymentCount*MONTH_IN_YEAR;

        double mortgage=principalAmount*(yearlyInterest*Math.pow(1+yearlyInterest,yearlyPaymentCount))/(Math.pow(1+yearlyInterest,yearlyPaymentCount)-1);
        String formattedMortgage=NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Your mortgage is "+formattedMortgage);
    }
}