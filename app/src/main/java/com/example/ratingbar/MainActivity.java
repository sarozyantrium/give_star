package com.example.ratingbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RatingBar rating_bar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rating_bar=(RatingBar) findViewById(R.id.rating_bar);

    }

    public void get_rating(View view)
    {
        float f=rating_bar.getRating();
        Toast.makeText(this,"Total Rating is "+f,Toast.LENGTH_LONG).show();
    }
}