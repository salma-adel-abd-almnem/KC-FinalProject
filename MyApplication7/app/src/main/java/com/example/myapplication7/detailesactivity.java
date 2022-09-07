package com.example.myapplication7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class detailesactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {setContentView(R.layout.activity_main2);
        setContentView(R.layout.detailsactivity); super.onCreate(savedInstanceState);

        Bundle bundle = getIntent().getExtras();
        Books delieverBooks = (Books) bundle.getSerializable("Books");

        TextView booknameTextView = findViewById(R.id.textView2);
        TextView bookdiscreptionTextView = findViewById(R.id.textView4);
        ImageView bookeimg = findViewById(R.id.imageView3);

        booknameTextView.setText(delieverBooks.getBookName());
        bookdiscreptionTextView.setText(delieverBooks.getDescription());
        bookeimg.setImageResource(delieverBooks.getBookImg());
    }
}