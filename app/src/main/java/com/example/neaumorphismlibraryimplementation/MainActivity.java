package com.example.neaumorphismlibraryimplementation;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.widget.Toast;

import soup.neumorphism.NeumorphCardView;
import soup.neumorphism.ShapeType;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private NeumorphCardView neumorphCard;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Circular animated button
        neumorphCard = findViewById(R.id.myNeumorphCard);

        ValueAnimator animator = ValueAnimator.ofFloat(6f, 1f, 6f);
        animator.setDuration(3000); // 3 seconds for smooth looping
        animator.setRepeatCount(ValueAnimator.INFINITE);
        animator.setRepeatMode(ValueAnimator.REVERSE);

        animator.addUpdateListener(animation -> {
            float value = (float) animation.getAnimatedValue();
            neumorphCard.setShadowElevation(value);
        });

        animator.start();


    }
}
