package com.e.covid19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.Toast;

public class Feedback extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        Button l1 = (Button) findViewById(R.id.link1);
        Button l2 = (Button) findViewById(R.id.link2);
        Button l3 = (Button) findViewById(R.id.link3);
        Button l4 = (Button) findViewById(R.id.link4);
        Button l5 = (Button) findViewById(R.id.link5);
        Button l6 = (Button) findViewById(R.id.link6);
        Button l7 = (Button) findViewById(R.id.link7);
        Button l8 = (Button) findViewById(R.id.link8);

        l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.coronavirus.gov"));
                startActivity(intent);

            }
        });

        l2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.youtube.com/watch?v=s2EVlqql_f8&t=2s"));
                startActivity(intent);

            }
        });
        l3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://viralzone.expasy.org/8996"));
                startActivity(intent);

            }
        });
        l4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://zhanglab.ccmb.med.umich.edu/COVID-19/"));
                startActivity(intent);

            }
        });
        l5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://pdb101.rcsb.org/motm/242"));
                startActivity(intent);

            }
        });
        l6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ncbi.nlm.nih.gov/genbank/sars-cov-2-seqs/"));
                startActivity(intent);

            }
        });
        l7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://pdb101.rcsb.org/motm/246"));
                startActivity(intent);

            }
        });
        l8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.youtube.com/watch?v=PSnSo9kYlH4"));
                startActivity(intent);

            }
        });

    }
}
