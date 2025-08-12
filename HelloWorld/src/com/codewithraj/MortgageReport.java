package com.codewithraj;

import java.text.NumberFormat;

public class MortgageReport {
    private MortgageCalculator calculator;
    private NumberFormat currencyInstance;

    public MortgageReport(MortgageCalculator calculator) {
        this.calculator = calculator;
    }

    public  void printMortgage() {
        double mortgage = calculator.calculateMortgage();
        currencyInstance = NumberFormat.getCurrencyInstance();
        String mortgageFormatted = currencyInstance.format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }

    public void printPaymentSchedule() {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for (short month = 1; month <= calculator.getYears() * MortgageCalculator.MONTHS_IN_YEAR; month++) {
            double balance = calculator.calculateBalance(month);
            System.out.println(currencyInstance.format(balance));
        }
    }
}
