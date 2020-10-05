package com.example.clicker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtDisp;
    Button btnClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClick = (Button)findViewById(R.id.buttonClick);
        txtDisp= (TextView)findViewById(R.id.textViewDisp);

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String countValue = txtDisp.getText().toString();
                int CountValue = Integer.parseInt(countValue);
                CountValue++;

                txtDisp.setText(String.valueOf(CountValue));
            }
        });
    }
}