package com.e.covid19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sc2 extends AppCompatActivity {

    private Button nextto, prevto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sc2);

       Button nextto = (Button) findViewById(R.id.tosc3);
        nextto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensc3();
            }
        });

        Button prevto = (Button) findViewById(R.id.tosc1);
        prevto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensc1();
            }
        });

    }
    public void opensc3(){
        Intent intent = new Intent(this, sc3.class);
        startActivity(intent);
    }
    public void opensc1(){
        Intent intent = new Intent(this, sc1.class);
        startActivity(intent);
    }


}
