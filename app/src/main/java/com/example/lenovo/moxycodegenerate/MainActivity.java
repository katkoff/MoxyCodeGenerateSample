package com.example.lenovo.moxycodegenerate;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;

public class MainActivity extends MvpAppCompatActivity implements MainView {

    private TextView textView;

    @InjectPresenter
    MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        initTextViewClickListener();
    }

    private void initTextViewClickListener() {
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainPresenter.onTextViewClicked(getString(R.string.main_new_text));
            }
        });
    }

    public void showMessage(String v) {
        Toast.makeText(this, v, Toast.LENGTH_LONG).show();
    }
}
