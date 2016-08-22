package com.android.developer.learn_android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessage extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        textView = (TextView) findViewById(R.id.activityB_text);
        Intent intent = getIntent();
        textView.setText(intent.getStringExtra(MainActivity.EXTRA_MESSAGE));
    }
}
