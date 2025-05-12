package com.example.neaumorphismlibraryimplementation;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

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

        neumorphCard = findViewById(R.id.myNeumorphCard);

        // Animate shadow elevation back and forth
        ValueAnimator animator = ValueAnimator.ofFloat(6f, 1f, 6f);
        animator.setDuration(3000); // 2 seconds for smoother animation
        animator.setRepeatCount(ValueAnimator.INFINITE);
        animator.setRepeatMode(ValueAnimator.REVERSE);

        animator.addUpdateListener(animation -> {
            float value = (float) animation.getAnimatedValue();
            neumorphCard.setShadowElevation(value);
        });

        animator.start();


    }
}
