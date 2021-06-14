package com.android.calculator.domain;

public class CalculatorImpl implements Calculator {

    @Override
    public int performBinaryOperator(int argOne, int argTwo, Operation operator) {
        return argOne + argTwo;
    }

    /*public void performBinaryOperator(double argumentOne, double argumentTwo, Operation operation) {
        *//*if (operation == null)*/



       /* if (operation == Operation.Multiply)
            return argumentOne * argumentTwo;

        if (operation == Operation.Subtract)
            return argumentOne / argumentTwo;

        if (operation == Operation.Divide)
            return argumentOne - argumentTwo;

        return 0;*/

    }