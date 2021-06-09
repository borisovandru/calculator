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








    /*public void onButtonSevenClicked() {
        computeArg(7);

        publishArgument();
    }*/

   /* public void onButtonEightClicked() {

        computeArg(8);

        publishArgument();
    }

    public void onButtonNineClicked() {

        computeArg(9);

        publishArgument();
    }

    public void onButtonDivideClicked() {

        computeArg(Divide);

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

    public void onButtonMultiplyClicked() {

        computeArg(Multiply);

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

    public void onButtonSubtractClicked() {

        computeArg(Subtract);

        publishArgument();
    }

    public void onButtonDotClicked() {

        int dot = 0;
        computeArg(dot);

        publishArgument();
    }

    public void onButtonZeroClicked() {

        computeArg(0);

        publishArgument();
    }

    public void onButtonEqualClicked() {

        computeArg(Equal);

        publishArgument();
    }

    public void onButtonAddClicked() {

        computeArg(Add);

        publishArgument();
    }

    public void onButtonClearClicked() {

        computeArg(Clear);

        publishArgument();
    }*/

    /*private void publishArgument() {

        if (isFirstArgument) {
            view.showResult(String.valueOf(argumentOne));
        } else {
            view.showResult(String.valueOf(argumentTwo));
        }
    }

    private void computeArg(int addition) {
        if (isFirstArgument) {
            argumentOne = argumentOne * 10 + addition;
        } else {
            argumentTwo = argumentTwo * 10 + addition;
        }

    }*/
    /*double res;

    {
        assert false;
        double argOne = 0;
        double argTwo = 0;
        res = calculator.binaryOperation(argOne, argTwo, Operation.operation);
    }*/

    /*public void onButtonOneClicked() {
    }

    public void onButtonTwoClicked() {
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
    }

    public void onButtonClearClicked() {
    }*/

