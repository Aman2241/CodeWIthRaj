package com.codewithraj;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int t = scanner.nextInt();

            while (t-- > 0) {
                String hiddenWord = scanner.next();
                String guessedWord = scanner.next();

                StringBuilder result= new StringBuilder();
                // Your code goes here
                for(int i=0; i<5 ;i++)
                {
                    if(hiddenWord.charAt(i)==guessedWord.charAt(i))
                        result.append("G");
                    else
                        result.append("B");
                }
                System.out.println(result);
            }
        }
    }


