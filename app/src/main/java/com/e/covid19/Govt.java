package com.e.covid19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;


public class Govt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_govt);
        findViewById(R.id.ambu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1Y6kcVv7g_bMVfNClewFDVM32uZ_PokSM/view?usp=sharing"));
                startActivity(intent);
            }
        });
        findViewById(R.id.police).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialPolice("100");
            }
        });
        findViewById(R.id.src).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialSenior("9830088884");
            }
        });
        findViewById(R.id.child).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialChild("1098");
            }
        });
        findViewById(R.id.almora).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialChild("139");
            }
        });
        findViewById(R.id.bageshwar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialChild("101");
            }
        });
        findViewById(R.id.chamoli).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialChild("112");
            }
        });
        findViewById(R.id.derha).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialChild("1075");
            }
        });
        findViewById(R.id.haridwar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialChild("108");
            }
        });
        findViewById(R.id.naini).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialChild("1097");
            }
        });
        findViewById(R.id.pohri).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialChild("97583992151");
            }
        });
        findViewById(R.id.pito).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialChild("9837972600");
            }
        });
        findViewById(R.id.tehri).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialChild("9411362810");
            }
        });
        findViewById(R.id.udham).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialChild("8958788763");
            }
        });
        findViewById(R.id.rudra).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialChild("9412325798");
            }
        });
        findViewById(R.id.uttar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialChild("9837020379");
            }
        });


    }
    private void dialAmbu(final String phoneNumber) {
        startActivity(new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phoneNumber, null)));
    }
    private void dialPolice(final String phoneNumber) {
        startActivity(new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phoneNumber, null)));
    }
    private void dialSenior(final String phoneNumber) {
        startActivity(new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phoneNumber, null)));
    }
    private void dialChild(final String phoneNumber) {
        startActivity(new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phoneNumber, null)));
    }
}
