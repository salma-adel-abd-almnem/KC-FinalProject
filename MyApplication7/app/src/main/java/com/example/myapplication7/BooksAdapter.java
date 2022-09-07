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

public class BooksAdapter extends ArrayAdapter {
    List<Books> BooksList;
    public BooksAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        BooksList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.item,parent,false);

        Books currentStudents = BooksList.get(position);
        TextView textView = view.findViewById(R.id.textView);
        TextView textView3 = view.findViewById(R.id.textView3);
        ImageView imageView = view.findViewById(R.id.imageView);


        textView3.setText(currentStudents.getBookName());
        textView.setText(String.valueOf(currentStudents.getWriterName()));
        imageView.setImageResource(currentStudents.getBookImg());



        return view;
    }
}
