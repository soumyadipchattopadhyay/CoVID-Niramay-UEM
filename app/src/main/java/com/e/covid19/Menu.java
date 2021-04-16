package com.e.covid19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    private Button developer, help, feedback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        developer = (Button) findViewById(R.id.developer);
        developer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openContact();

            }
        });
        help = (Button) findViewById(R.id.documentation);
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDoc();
            }
        });
        feedback = (Button) findViewById(R.id.feedback);
        feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFeedback();
            }
        });
        findViewById(R.id.global).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGlobal();
            }
        });
    }

    public void openContact(){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1b0us6UW46SvBH7JjNmU-9Mtpi08Xgje9/view?usp=sharing"));
        startActivity(intent);
    }
    public void openDoc(){

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.covid19india.org/"));
        startActivity(intent);
    }

    public void openFeedback(){

        Intent intent = new Intent(this, Feedback.class);
        startActivity(intent);
    }

    public void openGlobal(){

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.worldometers.info/coronavirus"));
        startActivity(intent);
    }
}
