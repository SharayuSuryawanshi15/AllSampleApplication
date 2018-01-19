package com.v2team.allsampleapplication.ORMLiteDemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.v2team.allsampleapplication.ORMLiteDemo.Model.StudentDetails;
import com.v2team.allsampleapplication.ORMLiteDemo.Model.TeacherDetails;
import com.v2team.allsampleapplication.R;

import java.sql.SQLException;

public class StudentAddActivity extends AppCompatActivity {

    EditText student_name_et, address_et;
    DBHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_add);
        student_name_et = (EditText) findViewById(R.id.student_name_et);
        address_et = (EditText) findViewById(R.id.address_et);
        dbHelper = new DBHelper(this);

    }

    public void submit(View view) {

        StudentDetails studentDetails = new StudentDetails(student_name_et.getText().toString(),address_et.getText().toString(),new TeacherDetails());

        try {
            Toast.makeText(this, "user created"+dbHelper.addStudent(studentDetails).isCreated(), Toast.LENGTH_SHORT).show();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
