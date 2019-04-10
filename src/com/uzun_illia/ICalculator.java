package com.uzun_illia;

public abstract class ICalculator {

    abstract int add(String a, String b);

    abstract int subtract(String a, String b);

    abstract int multiply(String a, String b);

    abstract int divide(String a, String b);

    boolean validationZero(String b) {
        if ((b.matches("\\d+") && Integer.parseInt(b) != 0) || !b.equals(""))
            return true;
        return false;
    }
}
