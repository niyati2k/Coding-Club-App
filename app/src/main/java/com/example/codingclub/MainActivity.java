package com.example.codingclub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView circle;
    TextView welcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        circle = findViewById(R.id.circle);
        circle.animate().translationY(-1300).setDuration(800).setStartDelay(300);

        welcome = findViewById(R.id.welcomeText);
        welcome.animate().translationY(-1000).setDuration(800).setStartDelay(300);


    }
}
