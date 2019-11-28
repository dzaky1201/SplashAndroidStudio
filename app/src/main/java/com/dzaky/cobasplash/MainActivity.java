package com.dzaky.cobasplash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.      activity_main);

        //Menajalankan wakatu delay
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //Setelah spalashscreen  berjalan akan pindah ke welcome activity
                startActivity(new Intent(MainActivity.this, WelcomeActivity.class));
                finish();

            }
        }, 5000); // waktu tunggu atau lamanya splashscreen
    }
}
