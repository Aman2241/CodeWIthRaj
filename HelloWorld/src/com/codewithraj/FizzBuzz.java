package com.codewithraj;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number =  input.nextInt();

        //using if else
        if (number % 5==0 && number % 3==0)
            System.out.println("FizzBuzz");
        else if(number % 5 ==0)
            System.out.println("Fizz");
        else if(number % 3 ==0)
            System.out.println("Buzz");
        else
            System.out.println(number);

        //using conditional operator
        String expectedResult= (number % 5==0 && number %3==0) ? "FizzBuzz" : number %5 == 0 ? "Fizz" : number %3 ==0 ? "Buzz" : String.valueOf(number);
        System.out.println(expectedResult);


        }
    }
