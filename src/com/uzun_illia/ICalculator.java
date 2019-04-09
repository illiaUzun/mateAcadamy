package com.uzun_illia;

public abstract class ICalculator {
    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    int divide(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("You can't divide by zero");
            throw new ArithmeticException();
        }
    }
}
