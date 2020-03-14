package com.alaarg.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    public void fade(View view){

        Log.i("Info", "You Click On Image ");
        ImageView partImageView = (ImageView) findViewById(R.id.partImageView);
        ImageView homerImageView = (ImageView) findViewById(R.id.homerImageView);

        partImageView.animate().scaleX(0.5f).scaleY(0.5f).setDuration(1000);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView partImageView = (ImageView) findViewById(R.id.partImageView);

        partImageView.setX(-1000);
        partImageView.animate().translationXBy(1000).rotation(3600).setDuration(3000);


    }
}
