package edu.itesm.lnb;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

public class SplashScreenActivity extends AppCompatActivity {

    private int delaySeconds = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {// a thread in Android
            @Override
            public void run() {
                Intent intent = new Intent( SplashScreenActivity.this  , MainMenuActivity.class  );
                startActivity(intent); // Go, go, go
                finish(); // kill this activity
            }
        },delaySeconds*1000); // time in milliseconds
    }
}
