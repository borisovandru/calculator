package com.android.calculator.domain;

public interface Calculator {

    /*int performBinaryOperator(int argOne, int argTwo, Operation operator);*/

    int performBinaryOperator(int argOne, int argTwo, Operation operator);

    /*@Override
            public int performBinaryOperator(int argOne, int argTwo, Operation operator) {
                    return argOne / argTwo;
                if (o)
                    return argOne + argTwo;
            }
        }*/
    double performBinaryOperator(double argumentOne, double argumentTwo, Operation operation);
}
