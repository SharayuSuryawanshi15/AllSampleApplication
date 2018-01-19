package com.v2team.allsampleapplication.Android3Tutorial;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.v2team.allsampleapplication.R;

public class ButtonDemoActivity extends AppCompatActivity {

    //diclaring field variables on class level
    Button submitButton;
    TextView resultStatusTextView;
    ImageButton submitImageButton;
    EditText userNameEditText, passwordEditText;
    String userName, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_demo);

        // Linking UI with Activity
        userNameEditText = (EditText) findViewById(R.id.usernameEditText);
        passwordEditText = (EditText) findViewById(R.id.passwordEditText);
        submitButton = (Button) findViewById(R.id.submitButton);
        resultStatusTextView = (TextView) findViewById(R.id.resultStatusTextView);
        submitImageButton = (ImageButton) findViewById(R.id.submitImageButton);
    }

    @Override
    protected void onStart() {
        super.onStart();

        // Handling on click event of button
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //get string entered by user
                userName = userNameEditText.getText().toString();
                password = passwordEditText.getText().toString();

                // setting string to textview
                resultStatusTextView.setText("userName :"+userName + " password " + password);

                // clearing edittext data
                userNameEditText.setText("");
                passwordEditText.setText("");
            }
        });
    }

    // Handling on click event of button
    public void onClickLoginButton(View view) {
        //get string entered by user
        userName = userNameEditText.getText().toString();
        password = passwordEditText.getText().toString();

        // setting string to textview
        resultStatusTextView.setText("userName :"+userName + " password " + password);

        // clearing edittext data
        userNameEditText.setText("");
        passwordEditText.setText("");
    }
}
