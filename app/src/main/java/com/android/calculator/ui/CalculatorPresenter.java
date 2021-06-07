package com.android.calculator.ui;

import com.android.calculator.domain.Calculator;
import com.android.calculator.domain.Operation;

public class CalculatorPresenter {

    private final CalculatorView view;

    private final Calculator calculator;

    private double argOne = 0;
    private double argTwo = 0;

    public CalculatorPresenter(CalculatorView view, Calculator calculator) {
        this.view = view;
        this.calculator = calculator;
    }


    public void onButtonOneClicked() {
        argOne =1;
    }

    public void onButtonTwoClicked() {
        argTwo =2;

        view.getSomeText();
    }

    public void onButtonNineClicked() {
    }

    public void onButtonSevenClicked() {
    }

    public void onButtonEightClicked() {
    }

    public void onButtonDivideClicked() {
    }

    public void onButtonFourClicked() {
    }

    public void onButtonFiveClicked() {
    }

    public void onButtonSixClicked() {
    }

    public void onButtonMultiplyClicked() {
    }

    public void onButtonThreeClicked() {
    }

    public void onButtonSubtractClicked() {
    }

    public void onButtonDotClicked() {
    }

    public void onButtonZeroClicked() {
    }

    public void onButtonEqualClicked() {
    }

    public void onButtonAddClicked() {
        double res = calculator.binaryOperation(argOne, argTwo, Operation.ADD);
    }

    public void onButtonClearClicked() {
    }
}
