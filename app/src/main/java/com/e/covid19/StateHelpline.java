package com.e.covid19;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class StateHelpline extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        WebView web = (WebView)findViewById(R.id.webView);
        web.loadUrl("file:///android_assets/phone.html");
        setContentView(web);
    }
}
