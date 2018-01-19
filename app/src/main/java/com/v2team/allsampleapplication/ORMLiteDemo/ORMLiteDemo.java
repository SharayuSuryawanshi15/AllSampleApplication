package com.v2team.allsampleapplication.ORMLiteDemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.v2team.allsampleapplication.R;

public class ORMLiteDemo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ormlite_demo);
    }

    public void addStudent(View view) {
        Intent i = new Intent(this,StudentAddActivity.class);
        startActivity(i);
    }

    public void addTeacher(View view) {
        Intent i = new Intent(this,TeacherAddActivity.class);
        startActivity(i);
    }

    public void viewStudentRecord(View view) {
        //Intent i = new Intent(this,.class);
        //startActivity(i);
    }

    public void viewTeacherRecord(View view) {
        Intent i = new Intent(this,ViewTeacherRecordActivity.class);
        startActivity(i);
    }
}
