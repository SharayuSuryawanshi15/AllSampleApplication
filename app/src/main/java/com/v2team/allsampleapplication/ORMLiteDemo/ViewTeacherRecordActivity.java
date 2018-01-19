package com.v2team.allsampleapplication.ORMLiteDemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.v2team.allsampleapplication.R;

public class ViewTeacherRecordActivity extends AppCompatActivity {

    ListView listview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_teacher_record);
        listview = (ListView) findViewById(R.id.listview);
    }

    @Override
    protected void onStart() {
        super.onStart();

    }
}
