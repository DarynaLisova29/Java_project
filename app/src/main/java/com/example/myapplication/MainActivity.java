package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView calc_textView;
    EditText number_1, number_2;
    Button add_button, next_application_btn;
    int count=0;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calc_textView=findViewById(R.id.calc_textView);
        number_1=findViewById(R.id.number_1);
        number_2=findViewById(R.id.number_2);
        next_application_btn=findViewById(R.id.add_button2);
        add_button=findViewById(R.id.add_button);
        next_application_btn=findViewById(R.id.add_button2);
        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num_1=Float.parseFloat(number_1.getText().toString());
                float num_2=Float.parseFloat(number_2.getText().toString());
                float result=num_1+num_2;
                calc_textView.setText(String.valueOf(result));
            }
        });

    }
    public void next_Page (View v){
        Intent intent=new Intent(this,theSecondPage.class);
        startActivity(intent);

    }
}