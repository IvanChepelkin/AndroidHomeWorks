package com.example.ivanchepelkin.androidhomeworks.Lesson2.les21;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

import com.example.ivanchepelkin.androidhomeworks.R;

public class Les21MainClass extends AppCompatActivity {
    EditText textIn;
    TextView textOut;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.les21_main_activity);
        initViews();
        textOut.setText("Лох");

    }
    public void initViews(){
        textIn = findViewById(R.id.textIn);
        textOut = findViewById(R.id.textOut);
    }
}
