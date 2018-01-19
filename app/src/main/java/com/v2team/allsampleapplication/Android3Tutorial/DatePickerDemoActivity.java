package com.v2team.allsampleapplication.Android3Tutorial;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import com.v2team.allsampleapplication.R;

public class DatePickerDemoActivity extends AppCompatActivity {

    TextView textView;
    DatePicker datePicker;
    Button submitButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_picker_demo);
        textView = (TextView) findViewById(R.id.dateTextView);
        datePicker=(DatePicker)findViewById(R.id.datePicker);
        submitButton = (Button) findViewById(R.id.submitButton);
    }

    @Override
    protected void onStart() {
        super.onStart();
        textView.setText("Current Date :"+ datePicker.getDayOfMonth()+"/"+(datePicker.getMonth()+1)+"/"+datePicker.getYear());

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Current Date :"+ datePicker.getDayOfMonth()+"/"+(datePicker.getMonth()+1)+"/"+datePicker.getYear());

            }
        });
    }
}
