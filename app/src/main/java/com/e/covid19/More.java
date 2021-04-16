package com.e.covid19;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class More extends AppCompatActivity implements View.OnClickListener {
    private CardView who, about, course, faq, hospital, zone, food, labour, report, track;
    private WebView back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more);

        track = (CardView)findViewById(R.id.cardView10);
        who = (CardView) findViewById(R.id.cardView);
        about = (CardView) findViewById(R.id.cardView2);
        course = (CardView) findViewById(R.id.cardView3);
        faq = (CardView) findViewById(R.id.cardView4);
        hospital = (CardView) findViewById(R.id.cardView6);
        labour = (CardView) findViewById(R.id.cardView5);
        food   = (CardView) findViewById(R.id.cardView7);
        report = (CardView) findViewById(R.id.cardView8);
        zone = (CardView) findViewById(R.id.cardView9);
        findViewById(R.id.cardView11).setOnClickListener(this);

        faq.setOnClickListener(this);
        who.setOnClickListener(this);
        about.setOnClickListener(this);
        course.setOnClickListener(this);
        hospital.setOnClickListener(this);
        labour.setOnClickListener(this);
        track.setOnClickListener(this);
        food.setOnClickListener(this);
        report.setOnClickListener(this);
        zone.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent i;

        switch (v.getId()) {
            case R.id.cardView:
                i = new Intent(this, Who.class);
                startActivity(i);
                break;
            case R.id.cardView2:
                i = new Intent(this, About.class);
                startActivity(i);
                break;
            case R.id.cardView3:
                i = new Intent(this, Course.class);
                startActivity(i);
                break;
            case R.id.cardView4:
                i = new Intent(this, faq.class);
                startActivity(i);
                break;

            case R.id.cardView5:
                i = new Intent(this, BankT.class);
                startActivity(i);
                break;
            case R.id.cardView6:
                i = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://drive.google.com/file/d/1jYKSTnOzVU7t2kQbHA5yA98AWeBSpE7N/view?usp=sharing"));
                startActivity(i);
                break;
            case R.id.cardView7:
                i = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://www.google.com/search?q=food+shelter+near+me&oq=food+shelter+near+me"));
                startActivity(i);
                break;
            case R.id.cardView8:
                i = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://drive.google.com/file/d/1Y6kcVv7g_bMVfNClewFDVM32uZ_PokSM/view?usp=sharing"));
                startActivity(i);
                break;

            case R.id.cardView9:
                i = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://drive.google.com/open?id=1XbcgvqelRIpyxF7X5_rU5cm3aPq5Nj6i"));
                startActivity(i);
                break;
            case R.id.cardView10:
                i = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://surveyheart.com/form/5ec78c9659d0bf14a419aa45"));
                startActivity(i);
                break;
            case R.id.cardView11:
                i = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://pmsma.nhp.gov.in/i-am/volunteer/ready-to-volunteer/"));
                startActivity(i);

            default:
                break;
        }
    }
}
