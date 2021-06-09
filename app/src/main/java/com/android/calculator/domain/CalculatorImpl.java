package com.android.calculator.domain;

public class CalculatorImpl implements Calculator {
    private Operation operation;

    @Override
    public int performBinaryOperator(int argOne, int argTwo, Operation operator) {
        if (operation == Operation.Divide)
        return argOne / argTwo;

    }

}