package com.example.third;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private TextView name;
    private TextView description;
    private TextView review;
    private Bundle extras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        name=(TextView) findViewById(R.id.textView);
        description=(TextView) findViewById(R.id.textView2);
        review=(TextView) findViewById(R.id.textView3);
        extras=getIntent().getExtras();
        if(extras!=null)
        {
            name.setText(extras.getString("name"));
            description.setText(extras.getString("description"));
            review.setText(extras.getString("review"));
        }
        }


    }

