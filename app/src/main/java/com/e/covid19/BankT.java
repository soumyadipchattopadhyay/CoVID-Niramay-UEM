package com.e.covid19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BankT extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_t);

        Button button1 = (Button) findViewById(R.id.link0);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGroc();
            }
        });

        Button button2 = (Button) findViewById(R.id.link1);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMed();
            }
        });



    }
    public void openMed(){
        Intent intent =  new Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://drive.google.com/file/d/1Egttxw5Wyd9AzO9RBayJ9bgkJzWl2Ier/view?usp=sharing"));
        startActivity(intent);
    }

    public void openGroc(){
        Intent intent = new Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://drive.google.com/file/d/10xAugTDC3gJkwfHdvaNEegB95SOmPMGS/view?usp=sharing"));
        startActivity(intent);
    }
}
