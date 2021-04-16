package com.e.covid19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sc3 extends AppCompatActivity {

    private Button prev, finish;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sc3);

        Button prev = (Button) findViewById(R.id.backsc2);
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               opentosc2();

            }
        });

        Button finish = (Button) findViewById(R.id.finish);
        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               openmain();

            }
        });
    }
    public void opentosc2(){
        Intent intent = new Intent(this, sc2.class);
        startActivity(intent);
    }
    public void openmain(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
