package com.android.calculator.ui;

public interface CalculatorView {

    void showResult(String result);

    void getSomeText();

    void showProgress();

    void hideProgress();
}