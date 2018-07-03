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

    protected void goToNextActivity(){
        final Intent intent = new Intent(mContext, TellJokeActivity.class);
        startActivity(intent);
    }

    public void tellJoke(View view) {
        goToNextActivity();
        Toast.makeText(this, "derp, version: "
                        + (BuildConfig.FLAVOR.equals("free") ? "peasant" : "sugar daddy")
                , Toast.LENGTH_SHORT).show();
    }

    public static void initBannerAd(View root){

    }
}
