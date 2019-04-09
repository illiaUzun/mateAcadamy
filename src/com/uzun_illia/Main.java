package com.uzun_illia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.uzun_illia.Converter.toDecimal;

public class Main {

    public static void main(String[] args) {

        while(true) {
            Scanner sc = new Scanner(System.in);
            ArabicCalc arabicCalc = new ArabicCalc();
            Calculator calculator = new Calculator();

            String a;
            String b;
            String operation;

            int calcType;

            do {
                a = sc.next();
                operation = sc.next();
                b = sc.next();

                calcType = validation(a, b, operation);
            } while (calcType < 0);

            if (calcType == 1) {
                switch (operation) {
                    case ("+"):
                        System.out.println(calculator.add(Integer.parseInt(a), Integer.parseInt(b)));
                        break;
                    case ("-"):
                        System.out.println(calculator.subtract(Integer.parseInt(a), Integer.parseInt(b)));
                        break;
                    case ("/"):
                        System.out.println(calculator.divide(Integer.parseInt(a), Integer.parseInt(b)));
                        break;
                    case ("*"):
                        System.out.println(calculator.multiply(Integer.parseInt(a), Integer.parseInt(b)));
                        break;
                }
            } else
                switch (operation) {
                    case ("+"):
                        System.out.println(arabicCalc.add(toDecimal(a), toDecimal(b)));
                        break;
                    case ("-"):
                        System.out.println(arabicCalc.subtract(toDecimal(a), toDecimal(b)));
                        break;
                    case ("/"):
                        System.out.println(arabicCalc.divide(toDecimal(a), toDecimal(b)));
                        break;
                    case ("*"):
                        System.out.println(arabicCalc.multiply(toDecimal(a), toDecimal(b)));
                        break;
                }
        }
    }

    static int validation(String a, String b, String operation) {
        String regex = "\\d+";
        List<String> operationValidation = new ArrayList<>();
        operationValidation.add("+");
        operationValidation.add("-");
        operationValidation.add("/");
        operationValidation.add("*");

        if (!operationValidation.contains(operation))
            return -1;

        if (a.matches(regex) && b.matches(regex))
            return 1;
        else if (!a.matches(regex) && !b.matches(regex))
            return 2;
        else
            return -1;
    }
}
