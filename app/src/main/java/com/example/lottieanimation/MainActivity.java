package com.example.lottieanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

import com.airbnb.lottie.LottieAnimationView;

import java.util.Timer;

public class MainActivity extends AppCompatActivity {
    public static final int Timer= Integer.parseInt("2000");
LottieAnimationView lotview;
Button btnlot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnlot=findViewById(R.id.btnlot);
        lotview=findViewById(R.id.lot);

        btnlot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lotview.setVisibility(View.VISIBLE);
                lotview.playAnimation();

                new Handler().postDelayed(this::resetButton,Timer);

            }

            private void resetButton() {
                lotview.pauseAnimation();
                lotview.setVisibility(View.GONE);
                startActivity(new Intent(getApplicationContext(),MainActivity.class));

            }
        });

    }
}