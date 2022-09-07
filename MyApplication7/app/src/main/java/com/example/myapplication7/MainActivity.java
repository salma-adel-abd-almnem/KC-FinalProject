package com.example.myapplication7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

     ArrayList<Students> studentsArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Students students = new Students("Salma",15,10,R.drawable.salma);
        Students students1 = new Students("Lma",16,11,R.drawable.lma);
        Students students2 = new Students("Sawzan",14,12,R.drawable.sawzan);
        Students students3= new Students("Ahmaade",19,10,R.drawable.omahmaaade);




        studentsArrayList.add(students);
        studentsArrayList.add(students1);
        studentsArrayList.add(students2);
        studentsArrayList.add(students3);


        studentsAdapter Students = new studentsAdapter(this,0,studentsArrayList);

        ListView listView = findViewById(R.id.listview5);
        listView.setAdapter(Students);







    }

}