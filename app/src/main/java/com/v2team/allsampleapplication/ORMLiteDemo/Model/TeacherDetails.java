package com.v2team.allsampleapplication.ORMLiteDemo.Model;

import com.j256.ormlite.field.DatabaseField;

import java.io.Serializable;

/**
 * Created by v2team on 17/1/18.
 */

public class TeacherDetails implements Serializable {
    /**
     *  Model class for teacher_details database table
     */

    // Primary key defined as an auto generated integer
    // If the database table column name differs than the Model class variable name, the way to map to use columnName
    @DatabaseField(generatedId = true, columnName = "teacher_id")
    public int teacherId;

    // Define a String type field to hold teacher's name
    @DatabaseField(columnName = "teacher_name")
    public String teacherName;

    // Define a String type field to hold student's address
    public String address;

    // Default constructor is needed for the SQLite, so make sure you also have it
    public TeacherDetails(){

    }

    //For our own purpose, so it's easier to create a TeacherDetails object
    public TeacherDetails(final String name, final String address){
        this.teacherName = name;
        this.address = address;
    }
}
