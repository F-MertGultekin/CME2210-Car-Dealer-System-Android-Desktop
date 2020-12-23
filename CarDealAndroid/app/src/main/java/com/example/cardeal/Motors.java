package com.example.cardeal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Motors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motors);
    }
    public  void changepageback(View view){

        Intent intent =new Intent(Motors.this,MainActivity.class);


        startActivity(intent);
    }
}
