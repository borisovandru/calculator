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

    public CalculatorPresenter(CalculatorView view, Calculator calculator) {
        this.view = view;
        this.calculator = calculator;

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
        isFirstArgument = false;

        if (operator != null) {

            int result = calculator.performBinaryOperator(argumentOne, argumentTwo, operator);

            view.showResult(String.valueOf(result));

            argumentOne = result;
            argumentTwo = 0;

        }

        operator = Operation.Clear;
    }

    public void onButtonAddClicked() {
        isFirstArgument = false;

        if (operator != null) {

            int result = calculator.performBinaryOperator(argumentOne, argumentTwo, operator);

            view.showResult(String.valueOf(result));

            argumentOne = result;
            argumentTwo = 0;

        }

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

        operator = Operation.Equal;
    }

    public void onButtonDotClicked() {
        /*isFirstArgument = false;

        if (operator != null) {

            int result = calculator.performBinaryOperator(argumentOne, argumentTwo, operator);

            view.showResult(String.valueOf(result));

            argumentOne = result;
            argumentTwo = 0;

        }
        operator = Operation.Divide;
        operator = Operation.Multiply;
        operator = Operation.Subtract;
        operator = Operation.Add;*/
    }

    public void onButtonSubtractClicked() {

        /*isFirstArgument = false;

        if (operator != null) {

            int result = calculator.performBinaryOperator(argumentOne, argumentTwo, operator);

            view.showResult(String.valueOf(result));

            argumentOne = result;
            argumentTwo = 0;

        }

        operator = Operation.Subtract;*/

    }

    public void onButtonMultiplyClicked() {

        /*isFirstArgument = false;

        if (operator != null) {

            int result = calculator.performBinaryOperator(argumentOne, argumentTwo, operator);

            view.showResult(String.valueOf(result));

            argumentOne = result;
            argumentTwo = 0;

        }

        operator = Operation.Multiply;*/

    }

    public void onButtonDivideClicked() {
       /* isFirstArgument = false;

        if (operator != null) {

            int result = calculator.performBinaryOperator(argumentOne, argumentTwo, operator);

            view.showResult(String.valueOf(result));

            argumentOne = result;
            argumentTwo = 0;

        }

        operator = Operation.Divide;*/
    }

    private void publishArgument() {

        if (isFirstArgument) {
            view.showResult(String.valueOf(argumentOne));
        } else {
            view.showResult(String.valueOf(argumentTwo));
        }
    }

    private void computeArg(/*, int Divide*/int Add) {
        if (isFirstArgument) {
            argumentOne = argumentOne * 10 + Add;
        } else {
            argumentTwo = argumentTwo * 10 + Add;
        }

        /*if (isFirstArgument) {
            argumentOne = argumentOne * 10 + Divide;
        } else {
            argumentTwo = argumentTwo * 10 + Divide;
        }*/

    }

    /*private void computeArg(int Subtract) {
        if (isFirstArgument) {
            argumentOne = argumentOne * 10 + Subtract;
        } else {
            argumentTwo = argumentTwo * 10 + Subtract;
        }
    }*/

}

