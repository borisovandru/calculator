package com.android.calculator.domain;

public class CalculatorImpl implements Calculator {

    @Override
    public int performBinaryOperator(int argOne, int argTwo, Operation operator) {
        return 0;
    }

    /*@Override
        public int performBinaryOperator(int argOne, int argTwo, Operation operator) {
                return argOne / argTwo;
            if (o)
                return argOne + argTwo;
        }
    }*/
    @Override
    public double performBinaryOperator(double argumentOne, double argumentTwo, Operation operation) {
        switch (operation) {
            case Add:
                return argumentOne + argumentTwo;
            case Multiply:
                return argumentOne * argumentTwo;
            case Divide:
                return argumentOne / argumentTwo;
            case Subtract:
                return argumentOne - argumentTwo;
            case Clear:
                return 0;
        }
        return 0;
    }
}