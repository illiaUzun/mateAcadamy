package com.uzun_illia;

import static com.uzun_illia.Converter.toDecimal;

public class ArabicCalc extends ICalculator {

    @Override
    int add(String a, String b) {
        return Integer.parseInt(a) + Integer.parseInt(b);
    }

    @Override
    int subtract(String a, String b) {
        return Integer.parseInt(a) - Integer.parseInt(b);
    }

    @Override
    int multiply(String a, String b) {
        return Integer.parseInt(a) * Integer.parseInt(b);
    }

    @Override
    int divide(String a, String b) throws ArithmeticException {
        if (validationZero(b))
            return Integer.parseInt(a) / Integer.parseInt(b);
        throw new ArithmeticException("You can't divide by zero. Try again.");
    }
}
