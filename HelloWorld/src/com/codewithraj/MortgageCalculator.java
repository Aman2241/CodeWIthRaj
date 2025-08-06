package com.codewithraj;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    final static byte MONTH_IN_YEAR = 12;
    final static byte PERCENT=100;
    public static void main(String[] args) {

        //Reading inputs
        double principalAmount = readNumber("Principal_Amount");
        double yearlyInterest = readNumber("Yearly_Interest");
        int yearlyPaymentCount = (int) (readNumber("Yearly_Payment_Count"));

        //mortgage calculator
        mortgageCalculator(principalAmount, yearlyInterest, yearlyPaymentCount);
        //mortgage remaining balance calculator
        mortgageRemainingBalance(yearlyPaymentCount, principalAmount, yearlyInterest);
    }

    private static void mortgageRemainingBalance(int yearlyPaymentCount, double principalAmount, double yearlyInterest) {
        System.out.println("-----Remaining Balance");
        for (int month = 1; month <= yearlyPaymentCount *MONTH_IN_YEAR; month++) {
            double remainingBalance = calculateRemainingBalance(principalAmount, yearlyInterest, yearlyPaymentCount,month);
            System.out.println(NumberFormat.getCurrencyInstance().format(remainingBalance));
        }
    }

    private static void mortgageCalculator(double principalAmount, double yearlyInterest, int yearlyPaymentCount) {
        double mortgage = getMortgage(principalAmount, yearlyInterest, yearlyPaymentCount);
        String formattedMortgage = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Your mortgage is " + formattedMortgage);
    }

    public static double calculateRemainingBalance(double principalAmount, double yearlyInterest, int yearlyPaymentCount, int noOfPaymentsMade) {

        double monthlyInterestRate= yearlyInterest/PERCENT/MONTH_IN_YEAR; //monthly interest rate
        double noOfPayments=yearlyPaymentCount*MONTH_IN_YEAR;
        return principalAmount *(Math.pow(1+monthlyInterestRate,noOfPayments)-Math.pow(1+monthlyInterestRate,noOfPaymentsMade))/(Math.pow(1+monthlyInterestRate,noOfPayments)-1);
    }

    private static double getMortgage(double principalAmount, double yearlyInterest, int yearlyPaymentCount) {
        double monthlyInterestRate= yearlyInterest/PERCENT/MONTH_IN_YEAR; //monthly interest rate
        double noOfPayments=yearlyPaymentCount*MONTH_IN_YEAR;
        return principalAmount *(monthlyInterestRate *Math.pow(1+ monthlyInterestRate, noOfPayments))/(Math.pow(1+ monthlyInterestRate, noOfPayments)-1);
    }

    public static double readNumber(String prompt)
    {
        double value;
        System.out.println(prompt);
        Scanner input = new Scanner(System.in);
        value = input.nextDouble();
        return value;
    }
}
