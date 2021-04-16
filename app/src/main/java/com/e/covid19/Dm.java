package com.e.covid19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Dm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        https://drive.google.com/file/d/1zABc4L9tpyIoGFWQ30u72fw_Jv-sX3LI/view?usp=sharing
        setContentView(R.layout.activity_dm);

        findViewById(R.id.bbank).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1Y6kcVv7g_bMVfNClewFDVM32uZ_PokSM/view?usp=sharing"));
                startActivity(intent);
            }
        });

        findViewById(R.id.hm).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1zABc4L9tpyIoGFWQ30u72fw_Jv-sX3LI/view?usp=sharing"));
                startActivity(intent);
            }
        });


        findViewById(R.id.ambu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "102", null)));
            }
        });
    }
}
