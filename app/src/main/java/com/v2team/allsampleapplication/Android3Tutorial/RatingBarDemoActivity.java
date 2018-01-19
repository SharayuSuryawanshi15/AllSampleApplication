package com.v2team.allsampleapplication.Android3Tutorial;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RatingBar;
import android.widget.Toast;

import com.v2team.allsampleapplication.R;

public class RatingBarDemoActivity extends AppCompatActivity {

    RatingBar ratingBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating_bar_demo);
        ratingBar = (RatingBar) findViewById(R.id.ratingBar);
    }

    public void onClickSubmitButton(View view) {
        Toast.makeText(this, "Rating"+ratingBar.getRating(), Toast.LENGTH_SHORT).show();
    }
}
