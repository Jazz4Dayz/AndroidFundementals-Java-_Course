package com.example.twoactivities_v2_codingchallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private static String convo;
    public static final String EXTRA_MESSAGE = "com.example.android.twoactivities_v2_codingchallenge.extra.MESSAGE";
    public static final int TEXT_REQUEST = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchSecondActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        String conversation;

        switch (view.getId()){
            case R.id.button_conversation_1:
                conversation = getResources().getString(R.string.conversation_1);
                intent.putExtra(EXTRA_MESSAGE, conversation);
                startActivityForResult(intent, TEXT_REQUEST);
                break;
            case R.id.button_conversation_2:
                conversation = getResources().getString(R.string.conversation_2);
                intent.putExtra(EXTRA_MESSAGE, conversation);
                startActivityForResult(intent, TEXT_REQUEST);
                break;
            case R.id.button_conversation_3:
                conversation = getResources().getString(R.string.conversation_3);
                intent.putExtra(EXTRA_MESSAGE, conversation);
                startActivityForResult(intent, TEXT_REQUEST);
                break;
        }
    }
}