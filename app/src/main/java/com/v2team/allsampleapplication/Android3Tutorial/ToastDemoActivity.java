package com.v2team.allsampleapplication.Android3Tutorial;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.v2team.allsampleapplication.R;

public class ToastDemoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast_demo);
    }

    public void onClickToastButton(View view) {
        displayDefaultToast();
        displayCustomToast();
    }

    private void displayDefaultToast() {
        Toast.makeText(this, "This is Default Toast", Toast.LENGTH_SHORT).show();
    }

    private void displayCustomToast() {

        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.layout_toast,
                (ViewGroup) findViewById(R.id.customToastContainer));
        TextView textView = (TextView) layout.findViewById(R.id.textview);
        textView.setText("This is a custom toast");
        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();
    }
}
