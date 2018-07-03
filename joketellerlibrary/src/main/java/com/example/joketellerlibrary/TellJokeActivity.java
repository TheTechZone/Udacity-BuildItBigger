package com.example.joketellerlibrary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class TellJokeActivity extends AppCompatActivity {

    public static final String JOKE_INTENT_KEY = "intent_joke";
    public TextView jokeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tell_joke);

        String joke = "";
        if (getIntent().hasExtra(JOKE_INTENT_KEY)) {
            joke = getIntent().getStringExtra(JOKE_INTENT_KEY);
        }
        jokeTextView = findViewById(R.id.jokes_tv);
        jokeTextView.setText(joke);
    }
}
