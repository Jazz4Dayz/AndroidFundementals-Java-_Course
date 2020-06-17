package com.example.scrollingtext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {
    ScrollView scrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scrollView = findViewById(R.id.scrollingView);
    }

    public void toTop(View view) {
        scrollView.scrollTo(0,0);
    }
}