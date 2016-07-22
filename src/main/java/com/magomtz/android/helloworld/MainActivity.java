package com.magomtz.android.helloworld;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    //@Bind(R.id.textView)
    //TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView.setText("Texto nuevo");
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://jorgemtzitc.com/cv"));
        startActivity(intent);
    }
}
