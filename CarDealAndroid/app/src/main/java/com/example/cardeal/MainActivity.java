package com.example.cardeal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public  void changepage(View view){

        Intent intent =new Intent(MainActivity.this,cars.class);


        startActivity(intent);
    }
    public  void changepage2(View view){

        Intent intent =new Intent(MainActivity.this,Motors.class);


        startActivity(intent);
    }
    public  void changepage3(View view){

        Intent intent =new Intent(MainActivity.this,UserInput.class);


        startActivity(intent);
    }
}
