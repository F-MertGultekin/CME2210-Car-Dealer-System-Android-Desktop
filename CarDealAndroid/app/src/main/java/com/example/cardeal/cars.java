package com.example.cardeal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.cardeal.ui.cars.CarsFragment;

public class cars extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cars_activity);

    }
    public  void changepageback(View view){

        Intent intent =new Intent(cars.this,MainActivity.class);


        startActivity(intent);
    }
}
