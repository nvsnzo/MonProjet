package com.example.pimpmyshoes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreenActivity extends AppCompatActivity {

    private final int Splash_Screnn_TIMEOUT = 10000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        // rediriger vers la page principale "MainActivity" après 10 secondes.
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                // Demarrer une page
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        };

        // Handler post delayed
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Demarrer une page
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, Splash_Screnn_TIMEOUT);

    }
}