package com.v2team.allsampleapplication.Android3Tutorial;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.v2team.allsampleapplication.R;

public class ToggleButtonDemoActivity extends AppCompatActivity {

    ToggleButton toggleButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle_button_demo);
        toggleButton = (ToggleButton) findViewById(R.id.toggleButton);
    }

    public void onClickToggleButton(View view) {
        Toast.makeText(this, "Toggle status " +toggleButton.getText().toString(), Toast.LENGTH_SHORT).show();
    }
}
