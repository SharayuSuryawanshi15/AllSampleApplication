package com.v2team.allsampleapplication.Android3Tutorial;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import com.v2team.allsampleapplication.R;

public class CheckBoxDemoActivity extends AppCompatActivity {

    CheckBox lunchCheckBox , dinnerCheckBox;
    Button submitButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box_demo);
        submitButton = (Button) findViewById(R.id.submitButton);
        lunchCheckBox = (CheckBox) findViewById(R.id.lunchCheckBox);
        dinnerCheckBox = (CheckBox) findViewById(R.id.dinnerCheckBox);
    }

    @Override
    protected void onStart() {
        super.onStart();

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                StringBuilder result = new StringBuilder();

                result.append("Order");
                if(lunchCheckBox.isChecked()){
                    result.append(" Lunch ");
                }
                if(dinnerCheckBox.isChecked()){
                    result.append(" Dinner ");
                }
                Toast.makeText(CheckBoxDemoActivity.this, result, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
