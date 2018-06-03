package com.example.user.butterknifeexp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnLongClick;

public class MainActivity extends AppCompatActivity {

    //BindView with the id
    @BindView(R.id.text_bind)
    TextView textBind;

    @BindView(R.id.hello)
    TextView hello;

    @BindString(R.string.value)
    String value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        //MUST to init in everywhere that uses butterKnife first

        textBind.setText(value);

    }

    @OnClick(R.id.button_red)
    public void buttonClick(){

        Toast.makeText(this, "red button clicked", Toast.LENGTH_SHORT).show();
    }

    @OnLongClick(R.id.button_blue)
    public void buttonNextLongClick(){

        Toast.makeText(this, "blue button clicked", Toast.LENGTH_SHORT).show();
    }
}
