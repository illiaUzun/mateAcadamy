package com.uzun_illia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.uzun_illia.Converter.toDecimal;

public class Main {

    public static void main(String[] args) throws Exception {

        while (true) {
            Scanner sc = new Scanner(System.in);
            ArabicCalc arabicCalc = new ArabicCalc();
            RomeCalc calculator = new RomeCalc();

            String a;
            String b;
            String operation;

            int calcType;

            do {
                System.out.println("Please enter first argument and press \"Enter\" :");
                a = sc.next();
                System.out.println("Please enter operation (+, -, * or /) and press \"Enter\" :");
                operation = sc.next();
                System.out.println("Please enter second argument and press \"Enter\" :");
                b = sc.next();


                calcType = validation(a, b, operation);


            } while (calcType < 0);

            if (calcType == 2)
                operating(operation, calculator.add(a, b), calculator.subtract(a, b), calculator.divide(a, b), calculator.multiply(a, b));
            else
                operating(operation, arabicCalc.add(a, b), arabicCalc.subtract(a, b), arabicCalc.divide(a, b), arabicCalc.multiply(a, b));
        }
    }

    private static void operating(String operation, int add, int subtract, int divide, int multiply) {
        switch (operation) {
            case "+":
                System.out.println(add);
                break;
            case "-":
                System.out.println(subtract);
                break;
            case "/":
                System.out.println(divide);
                break;
            case "*":
                System.out.println(multiply);
                break;
        }
    }

    private static int validation(String a, String b, String operation) throws Exception {
        String regex = "\\d+";
        List<String> operationValidation = new ArrayList<>();
        operationValidation.add("+");
        operationValidation.add("-");
        operationValidation.add("/");
        operationValidation.add("*");

        if (!operationValidation.contains(operation)) {
            System.out.println("There is no such operation possible yet");
            return -1;
        }

        if (a.matches(regex) && b.matches(regex))
            return 1;
        else if (!a.matches(regex) && !b.matches(regex))
            return 2;
        else
            throw new Exception("Some of the arguments was wrong (you can't use arabic and roman number at the same time)");
    }
}
