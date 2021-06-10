package com.android.calculator.ui;

import com.android.calculator.domain.Calculator;
import com.android.calculator.domain.Operation;

public class CalculatorPresenter {

    private final CalculatorView view;
    private final Calculator calculator;
    private int argumentOne = 0;
    private int argumentTwo = 0;
    private boolean isFirstArgument = true;
    private Operation operator = null;
    private final int Clear;

    public CalculatorPresenter(CalculatorView view, Calculator calculator, int clear) {
        this.view = view;
        this.calculator = calculator;
        Clear = clear;

        publishArgument();
    }

    public void onButtonSevenClicked() {
        computeArg(7);

        publishArgument();
    }

    public void onButtonEightClicked() {
        computeArg(8);

        publishArgument();
    }

    public void onButtonNineClicked() {
        computeArg(9);

        publishArgument();
    }

    public void onButtonFourClicked() {

        computeArg(4);

        publishArgument();
    }

    public void onButtonFiveClicked() {

        computeArg(5);

        publishArgument();
    }

    public void onButtonSixClicked() {

        computeArg(6);

        publishArgument();
    }

    public void onButtonOneClicked() {

        computeArg(1);

        publishArgument();
    }

    public void onButtonTwoClicked() {
        computeArg(2);

        publishArgument();
    }

    public void onButtonThreeClicked() {
        computeArg(3);

        publishArgument();
    }

    public void onButtonZeroClicked() {
        computeArg(0);

        publishArgument();
    }

    public void onButtonClearClicked() {
        computeArg(Clear);

        publishArgument();
    }

    public void onButtonAddClicked() {
        isFirstArgument = false;

        if (operator != null) {

            int result = calculator.performBinaryOperator(argumentOne, argumentTwo, operator);

            view.showResult(String.valueOf(result));

            argumentOne = result;
            argumentTwo = 0;

        }
        operator = Operation.Divide;
        operator = Operation.Multiply;
        operator = Operation.Subtract;
        operator = Operation.Add;
    }

    public void onButtonEqualClicked() {
        isFirstArgument = false;

        if (operator != null) {

            int result = calculator.performBinaryOperator(argumentOne, argumentTwo, operator);

            view.showResult(String.valueOf(result));

            argumentOne = result;
            argumentTwo = 0;

        }
        operator = Operation.Divide;
        operator = Operation.Multiply;
        operator = Operation.Subtract;
        operator = Operation.Add;
    }

    public void onButtonDotClicked() {
        isFirstArgument = false;

        if (operator != null) {

            int result = calculator.performBinaryOperator(argumentOne, argumentTwo, operator);

            view.showResult(String.valueOf(result));

            argumentOne = result;
            argumentTwo = 0;

        }
        operator = Operation.Divide;
        operator = Operation.Multiply;
        operator = Operation.Subtract;
        operator = Operation.Add;
    }

    public void onButtonSubtractClicked() {

        isFirstArgument = false;

        if (operator != null) {

            int result = calculator.performBinaryOperator(argumentOne, argumentTwo, operator);

            view.showResult(String.valueOf(result));

            argumentOne = result;
            argumentTwo = 0;

        }
        operator = Operation.Divide;
        operator = Operation.Multiply;
        operator = Operation.Subtract;
        operator = Operation.Add;

    }

    public void onButtonMultiplyClicked() {

        isFirstArgument = false;

        if (operator != null) {

            int result = calculator.performBinaryOperator(argumentOne, argumentTwo, operator);

            view.showResult(String.valueOf(result));

            argumentOne = result;
            argumentTwo = 0;

        }
        operator = Operation.Divide;
        operator = Operation.Multiply;
        operator = Operation.Subtract;
        operator = Operation.Add;
    }

    public void onButtonDivideClicked() {
        isFirstArgument = false;

        if (operator != null) {

            int result = calculator.performBinaryOperator(argumentOne, argumentTwo, operator);

            view.showResult(String.valueOf(result));

            argumentOne = result;
            argumentTwo = 0;

        }
        operator = Operation.Divide;
        operator = Operation.Multiply;
        operator = Operation.Subtract;
        operator = Operation.Add;
    }

    private void publishArgument() {

        if (isFirstArgument) {
            view.showResult(String.valueOf(argumentOne));
        } else {
            view.showResult(String.valueOf(argumentTwo));
        }
    }

    private void computeArg(int divide) {
        if (isFirstArgument) {
            argumentOne = argumentOne * 10 + divide;
        } else {
            argumentTwo = argumentTwo * 10 + divide;
        }
    }

}

