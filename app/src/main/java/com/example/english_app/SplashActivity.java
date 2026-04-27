package com.example.english_app;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    private Handler handler;
    private Runnable splashRunnable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Get views
        TextView logoLetter  = findViewById(R.id.logo_letter);
        TextView appName     = findViewById(R.id.app_name);
        TextView tagline     = findViewById(R.id.app_tagline);

        AnimationSet logoAnim = new AnimationSet(true);

        ScaleAnimation scale = new ScaleAnimation(
                0f, 1f, 0f, 1f,
                Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f);
        scale.setDuration(700);

        AlphaAnimation fadeIn = new AlphaAnimation(0f, 1f);
        fadeIn.setDuration(700);

        logoAnim.addAnimation(scale);
        logoAnim.addAnimation(fadeIn);
        logoAnim.setFillAfter(true);
        logoLetter.startAnimation(logoAnim);

        AlphaAnimation nameFade = new AlphaAnimation(0f, 1f);
        nameFade.setDuration(600);
        nameFade.setStartOffset(600);
        nameFade.setFillAfter(true);
        appName.startAnimation(nameFade);

        AlphaAnimation tagFade = new AlphaAnimation(0f, 1f);
        tagFade.setDuration(600);
        tagFade.setStartOffset(1000);
        tagFade.setFillAfter(true);
        tagline.startAnimation(tagFade);


        handler = new Handler(Looper.getMainLooper());
        splashRunnable = () -> {
            if (!isFinishing() && !isDestroyed()) {
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                finish();
            }
        };
        handler.postDelayed(splashRunnable, 2800);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (handler != null && splashRunnable != null) {
            handler.removeCallbacks(splashRunnable);
        }
    }
}