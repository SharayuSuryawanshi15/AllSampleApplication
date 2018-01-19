package com.v2team.allsampleapplication.ORMLiteDemo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import com.v2team.allsampleapplication.ORMLiteDemo.Model.StudentDetails;
import com.v2team.allsampleapplication.ORMLiteDemo.Model.TeacherDetails;

import java.sql.SQLException;

/**
 * Created by v2team on 17/1/18.
 */

public class DBHelper extends OrmLiteSqliteOpenHelper {


    public static final String DB_NAME = "student_manager.db";
    private static final int DB_VERSION = 1;

    public DBHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
        getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase database, ConnectionSource connectionSource) {
        try {
            TableUtils.createTable(connectionSource, TeacherDetails.class);
            TableUtils.createTable(connectionSource, StudentDetails.class);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase database, ConnectionSource connectionSource, int oldVersion, int newVersion) {

    }

    public Dao.CreateOrUpdateStatus addStudent(StudentDetails obj) throws SQLException {
        Dao<StudentDetails, ?> dao = (Dao<StudentDetails, ?>) getDao(obj.getClass());
        return dao.createOrUpdate(obj);
    }


}
