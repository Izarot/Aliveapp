package com.example.aliveapp;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView text = new TextView(this);
        text.setText("AliveApp Lives");
        text.setTextSize(28f);
        text.setAlpha(0f);

        setContentView(text);

        text.animate()
            .alpha(1f)
            .setDuration(800)
            .start();
    }
}