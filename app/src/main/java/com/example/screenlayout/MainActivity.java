package com.example.screenlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView titleText = findViewById(R.id.title_text);
        TextView descriptionText = findViewById(R.id.description_text);
        ImageView appIcon = findViewById(R.id.app_icon);

    }
}