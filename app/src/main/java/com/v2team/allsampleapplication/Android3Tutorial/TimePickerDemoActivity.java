package com.v2team.allsampleapplication.Android3Tutorial;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import com.v2team.allsampleapplication.R;

import java.util.Date;

public class TimePickerDemoActivity extends AppCompatActivity {

    TimePicker timePicker; TextView timeTextView ; Button submitButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_picker_demo);
        timePicker = (TimePicker) findViewById(R.id.timepicker);
        timeTextView=(TextView) findViewById(R.id.timeTextview);
        submitButton = (Button) findViewById(R.id.submitButton);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Date date = new Date();
        String s = timePicker.getCurrentHour()+":"+timePicker.getCurrentMinute();
        timeTextView.setText(s);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = timePicker.getCurrentHour()+":"+timePicker.getCurrentMinute();
                timeTextView.setText(s);
            }
        });
    }


}
