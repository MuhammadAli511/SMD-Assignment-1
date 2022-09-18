package com.muhammadali.i190417;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button screen1;
    Button screen2;
    Button screen3;
    Button screen4;
    Button screen5;
    Button screen6;
    Button screen7;
    Button screen8;
    Button screen9;
    Button screen10;
    Button screen11;
    Button screen12;
    Button screen13;
    Button screen14;
    Button screen15;
    Button screen16;
    Button screen17;
    Button screen18;
    Button screen19;
    Button screen20;
    Button screen21;
    Button screen22;
    Button screen23;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        screen1 = findViewById(R.id.screen1);
        screen2 = findViewById(R.id.screen2);
        screen3 = findViewById(R.id.screen3);
        screen4 = findViewById(R.id.screen4);
        screen5 = findViewById(R.id.screen5);
        screen6 = findViewById(R.id.screen6);
        screen7 = findViewById(R.id.screen7);
        screen8 = findViewById(R.id.screen8);
        screen9 = findViewById(R.id.screen9);
        screen10 = findViewById(R.id.screen10);
        screen11 = findViewById(R.id.screen11);
        screen12 = findViewById(R.id.screen12);
        screen13 = findViewById(R.id.screen13);
        screen14 = findViewById(R.id.screen14);
        screen15 = findViewById(R.id.screen15);
        screen16 = findViewById(R.id.screen16);
        screen17 = findViewById(R.id.screen17);
        screen18 = findViewById(R.id.screen18);
        screen19 = findViewById(R.id.screen19);
        screen20 = findViewById(R.id.screen20);
        screen21 = findViewById(R.id.screen21);
        screen22 = findViewById(R.id.screen22);
        screen23 = findViewById(R.id.screen23);




        screen1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Screen1.class);
                startActivity(intent);
            }
        });

        screen2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Screen2.class);
                startActivity(intent);
            }
        });

        screen3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Screen3.class);
                startActivity(intent);
            }
        });

        screen4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,screen4.class);
                startActivity(intent);
            }
        });

        screen5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,screen5.class);
                startActivity(intent);
            }
        });

        screen6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,screen6.class);
                startActivity(intent);
            }
        });

        screen7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,screen7.class);
                startActivity(intent);
            }
        });

        screen8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,screen8.class);
                startActivity(intent);
            }
        });

        screen9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,screen9.class);
                startActivity(intent);
            }
        });

        screen10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,screen10.class);
                startActivity(intent);
            }
        });

        screen11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,screen11.class);
                startActivity(intent);
            }
        });

        screen12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,screen12.class);
                startActivity(intent);
            }
        });

        screen13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,screen13.class);
                startActivity(intent);
            }
        });

        screen14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,screen14.class);
                startActivity(intent);
            }
        });

        screen15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,screen15.class);
                startActivity(intent);
            }
        });

        screen16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,screen16.class);
                startActivity(intent);
            }
        });

        screen17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,screen17.class);
                startActivity(intent);
            }
        });

        screen18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,screen18.class);
                startActivity(intent);
            }
        });

        screen19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,screen19.class);
                startActivity(intent);
            }
        });

        screen20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,screen20.class);
                startActivity(intent);
            }
        });

        screen21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,screen21.class);
                startActivity(intent);
            }
        });

        screen22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,screen22.class);
                startActivity(intent);
            }
        });

        screen23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,screen23.class);
                startActivity(intent);
            }
        });
    }
}