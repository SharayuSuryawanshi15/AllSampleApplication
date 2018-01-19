package com.v2team.allsampleapplication.ORMLiteDemo;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.v2team.allsampleapplication.ORMLiteDemo.Model.StudentDetails;

import java.util.ArrayList;
import java.util.zip.Inflater;

/**
 * Created by v2team on 17/1/18.
 */

public class viewRecordAdapter extends BaseAdapter {
    public Context context;
    ArrayList<StudentDetails> studentDetails;
    public viewRecordAdapter(Context context , ArrayList<StudentDetails> studentDetails){
        this.context = context;
        this.studentDetails = studentDetails;
    }
    @Override
    public void registerDataSetObserver(DataSetObserver dataSetObserver) {

    }

    @Override
    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {

    }

    @Override
    public int getCount() {
        return studentDetails.size();
    }

    @Override
    public Object getItem(int i) {
        return studentDetails.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Inflater inflater ;
        //LayoutInflater layoutInflater = inflater.inflate(android.support.v4.R.layout)
        return null;
    }

    @Override
    public int getItemViewType(int i) {
        return 0;
    }

    @Override
    public int getViewTypeCount() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
