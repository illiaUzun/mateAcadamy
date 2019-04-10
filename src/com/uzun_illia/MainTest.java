package com.uzun_illia;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {


    //TODO: Teting

    @org.junit.jupiter.api.Test
    void romeAddTest() {
        RomeCalc calculator = new RomeCalc();

        String a = "i";
        String b = "i";

        assertEquals(2, calculator.add(a,b));

        a += "i";
        b += "i";
        assertEquals(4, calculator.add(a,b));

        a = "X";
        b = "V";
        assertEquals(15, calculator.add(a,b));

        a = "III";
        b = "C";
        assertEquals(103, calculator.add(a,b));
    }

    @org.junit.jupiter.api.Test
    void romeSubtructTest() {
        RomeCalc calculator = new RomeCalc();

        String a = "i";
        String b = "i";

        assertEquals(0, calculator.subtract(a,b));

        a = "XX";
        b = "XXX";

        assertEquals(-10, calculator.subtract(a,b));
    }

    @org.junit.jupiter.api.Test
    void romeMuliplyTest() {
        RomeCalc calculator = new RomeCalc();

        String a = "i";
        String b = "i";

        assertEquals(1, calculator.multiply(a,b));

        a = "";
        b = "X";

        assertEquals(0, calculator.multiply(a,b));

        a = "V";
        b = "";

        assertEquals(0, calculator.multiply(a,b));

    }

    @org.junit.jupiter.api.Test
    void romeDevideTest() {
        RomeCalc calculator = new RomeCalc();

        String a = "i";
        String b = "i";

        assertEquals(1, calculator.divide(a,b));

        a = "X";
        b = "ii";

        assertEquals(5, calculator.divide(a,b));
    }


    @org.junit.jupiter.api.Test
    void validation() {

    }
}