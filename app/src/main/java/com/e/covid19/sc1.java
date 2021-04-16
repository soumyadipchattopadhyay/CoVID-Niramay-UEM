package com.e.covid19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sc1 extends AppCompatActivity {

    private Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sc1);

        Button next = (Button) findViewById(R.id.tosc2);
        next.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                opensc2();
            }
        });

    }
    public void opensc2(){
        Intent intent = new Intent(this, sc2.class);
        startActivity(intent);
    }
       }

