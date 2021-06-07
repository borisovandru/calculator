package com.android.calculator.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.android.calculator.R;
import com.android.calculator.domain.CalculatorImpl;

public class CalculatorMain extends AppCompatActivity implements CalculatorView {

    private CalculatorPresenter presenter;

    private final TextView resultText;

    public CalculatorMain(TextView resultText) {
        this.resultText = resultText;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_grid_layout);



        presenter = new CalculatorPresenter(this, new CalculatorImpl());



        findViewById(R.id.button_7).setOnClickListener(v -> presenter.onButtonSevenClicked());

        findViewById(R.id.button_8).setOnClickListener(v -> { presenter.onButtonEightClicked();Clicked(); });

        findViewById(R.id.button_9).setOnClickListener(v -> { presenter.onButtonNineClicked();Clicked(); });

        findViewById(R.id.button_divide).setOnClickListener(v -> presenter.onButtonDivideClicked());

        findViewById(R.id.button_4).setOnClickListener(v -> presenter.onButtonFourClicked());

        findViewById(R.id.button_5).setOnClickListener(v -> presenter.onButtonFiveClicked());

        findViewById(R.id.button_6).setOnClickListener(v -> presenter.onButtonSixClicked());

        findViewById(R.id.button_Multiply).setOnClickListener(v -> presenter.onButtonMultiplyClicked());

        findViewById(R.id.button_1).setOnClickListener(v -> presenter.onButtonOneClicked());

        findViewById(R.id.button_2).setOnClickListener(v -> presenter.onButtonTwoClicked());

        findViewById(R.id.button_3).setOnClickListener(v -> presenter.onButtonThreeClicked());

        findViewById(R.id.button_Subtract).setOnClickListener(v -> presenter.onButtonSubtractClicked());

        findViewById(R.id.button_Dot).setOnClickListener(v -> presenter.onButtonDotClicked());

        findViewById(R.id.button_0).setOnClickListener(v -> presenter.onButtonZeroClicked());

        findViewById(R.id.button_Equal).setOnClickListener(v -> presenter.onButtonEqualClicked());

        findViewById(R.id.button_Add).setOnClickListener(v -> presenter.onButtonAddClicked());

        findViewById(R.id.button_Clear).setOnClickListener(v -> presenter.onButtonClearClicked());
    }

    private void Clicked() {
    }

    @Override
    public void showResult(String result) {
        resultText.setText(result);
    }

    @Override
    public void getSomeText() { }

    @Override
    public void showProgress() { resultText.setVisibility(View.VISIBLE); }

    @Override
    public void hideProgress() { resultText.setVisibility(View.GONE); }

}