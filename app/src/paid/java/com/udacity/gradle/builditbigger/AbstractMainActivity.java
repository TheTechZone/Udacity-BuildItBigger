package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.joketellerlibrary.TellJokeActivity;

public abstract class AbstractMainActivity extends AppCompatActivity {

    Context mContext;

    protected void initAd(final Context context){
        mContext = context;
    }

    public void tellJoke(View view) {
        new JokeEndpointTask().execute(mContext);
    }

    public static void initBannerAd(View root){

    }
}
