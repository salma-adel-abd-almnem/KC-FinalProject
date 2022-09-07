package com.example.myapplication7;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class studentsAdapter extends ArrayAdapter {
    List<Students> studentsList;
    public studentsAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        studentsList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.item,parent,false);

        Students currentStudents = studentsList.get(position);
        TextView textView = view.findViewById(R.id.textView);
        TextView textView1 = view .findViewById(R.id.textView1);
        TextView textView3 = view.findViewById(R.id.textView3);
        ImageView imageView = view.findViewById(R.id.imageView2);

        textView3.setText(currentStudents.getStudentName());
        textView.setText(String.valueOf(currentStudents.getStudentAge()));
        textView1.setText(String.valueOf(currentStudents.getStudentGrade()));
        imageView.setImageResource(currentStudents.getStudentImg());


        return view;
    }
}
