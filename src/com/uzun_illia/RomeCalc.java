package com.uzun_illia;

import static com.uzun_illia.Converter.toDecimal;

public class RomeCalc extends ICalculator {

    @Override
    int add(String a, String b) {
        return toDecimal(a) + toDecimal(b);
    }

    @Override
    int subtract(String a, String b) {
        return toDecimal(a) - toDecimal(b);
    }

    @Override
    int multiply(String a, String b) {
        return toDecimal(a) * toDecimal(b);
    }

    @Override
    int divide(String a, String b) throws ArithmeticException {
        if (validationZero(b))
            return toDecimal(a) / toDecimal(b);
        throw new ArithmeticException("You can't divide by zero. Try again.");
    }
}
