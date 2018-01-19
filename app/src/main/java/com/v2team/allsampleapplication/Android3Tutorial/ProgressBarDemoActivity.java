package com.v2team.allsampleapplication.Android3Tutorial;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.v2team.allsampleapplication.R;

public class ProgressBarDemoActivity extends AppCompatActivity {

    Button button;
    ProgressDialog progressBar;
    static int counter = 0 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar);
        button = (Button) findViewById(R.id.submitButton);
    }

    @Override
    protected void onStart() {
        super.onStart();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                progressBar = new ProgressDialog(ProgressBarDemoActivity.this);
                progressBar.setMessage("Loading Data");
                progressBar.setMax(100);
                progressBar.setProgress(0);
                progressBar.setMessage("File downloading ...");
                progressBar.setCancelable(false);
                progressBar.show();

            }
        });
    }


    }

