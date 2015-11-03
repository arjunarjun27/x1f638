package io.github.rockerhieu.x1f638.mvp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import io.github.rockerhieu.x1f638.R;

public class MvpActivity extends AppCompatActivity implements CounterView {
    Button vIncrease;
    CounterPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);
        vIncrease = (Button) findViewById(R.id.increase);
        presenter = new CounterPresenterImp();
        presenter.setView(this);
    }

    public void onIncreaseClicked(View view) {
        presenter.onIncreaseClicked();
    }

    @Override
    public void setCounterText(String text) {
        vIncrease.setText(text);
    }
}