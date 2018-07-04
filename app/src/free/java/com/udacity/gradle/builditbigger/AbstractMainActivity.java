package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.content.Intent;
import android.support.v4.util.Pair;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.example.joketellerlibrary.TellJokeActivity;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public abstract class AbstractMainActivity extends AppCompatActivity {
    private InterstitialAd mInterstitialAd;

    Context mContext;
    private String joke;

    protected void initAd(final Context context){
        mContext = context;

        MobileAds.initialize(this, "ca-app-pub-3940256099942544~3347511713");

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        mInterstitialAd.loadAd(new AdRequest.Builder().addTestDevice(AdRequest.DEVICE_ID_EMULATOR).build());



        if(mInterstitialAd != null)
            mInterstitialAd.setAdListener(new AdListener() {
                @Override
                public void onAdLoaded() {
                    //Here set a flag to know that your
                }

                @Override
                public void onAdClosed() {
                    // Proceed to the next activity.
                    mInterstitialAd.loadAd(new AdRequest.Builder().build());
                    Log.i("Ads", "onAdClosed");
                    JokeEndpointTask task = new JokeEndpointTask();
                    task.execute(mContext);
                }
            });
    }


    public void tellJoke(View view) {
        if(mInterstitialAd.isLoaded()){
            mInterstitialAd.show();
        }
    }

    public static void initBannerAd(View root){
        AdView mAdView = root.findViewById(R.id.adView);
        // Create an ad request. Check logcat output for the hashed device ID to
        // get test ads on a physical device. e.g.
        // "Use AdRequest.Builder.addTestDevice("ABCDEF012345") to get test ads on this device."
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();
        mAdView.loadAd(adRequest);
    }
}
