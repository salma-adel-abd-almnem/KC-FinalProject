package com.example.myapplication7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText Name,Email,Password;
    Button login;

     ArrayList<Books> BooksArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name=findViewById(R.id.editText1);
        Email=findViewById(R.id.editTextTextEmailAddress);
        Password=findViewById(R.id.editTextTextPassword);
        login = findViewById(R.id.button);


         login.setOnClickListener(new View.OnClickListener() {
            @Override
             public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);

                if (TextUtils.isEmpty(Name.getText().toString())){
                    Name.setError("Name is compulsary");
                }
                if (TextUtils.isEmpty(Email.getText().toString())){
                    Email.setError("E-mail is important");
                }
                if (TextUtils.isEmpty(Password.getText().toString())){
                    Password.setError("Password is must");
                    return;
                }
                Toast.makeText(MainActivity.this, "sinupSuccesfully", Toast.LENGTH_SHORT).show();
            }
        });








    }

}