package com.android.developer.learn_android;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.android.developer.learn_android";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void send(View view) {
        TextView textView = (TextView) findViewById(R.id.edit_message);
        String message = textView.getText().toString();
        Intent intent = new Intent(this, DisplayMessage.class);
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

    }
}
