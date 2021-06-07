package com.android.calculator.domain;

public class CalculatorImpl implements Calculator {

    @Override
    public double binaryOperation(double argOne, double argTwo, Operation operation) {
        if (operation == Operation.ADD) { return argOne + argTwo; }

        { if (operation == Operation.Multiply) { return argOne * argTwo; }

            if (operation == Operation.Subtract) { return argOne - argTwo; }
            if (operation == Operation.Divide) { return argOne / argTwo; }
            return 0; }
    }
}