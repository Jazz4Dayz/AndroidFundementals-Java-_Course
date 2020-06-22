package com.example.twoactivities_v2_codingchallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void getConversation(View view) {
        switch (view.getId()){
            case R.id.button_conversation_1

                break;
            case R.id.button_conversation_2

                break;
            case R.id.button_conversation_3

                break;
        }
    }
}