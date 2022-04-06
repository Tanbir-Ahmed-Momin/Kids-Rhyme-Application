package com.example.kidsrhyme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button fast;
    Button second;
    Button third;
    Button four;
    Button five;
    Button six;
    Button seven;
    Button abut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fast = (Button) findViewById(R.id.ttls);
        second = (Button) findViewById(R.id.jack);
        third = (Button) findViewById(R.id.hump);
        four = (Button) findViewById(R.id.hick);
        five = (Button) findViewById(R.id.baa);
        six = (Button) findViewById(R.id.litt);
        seven = (Button) findViewById(R.id.pat);
        abut = (Button) findViewById(R.id.abt);
        fast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, First.class);
                startActivity(i);
            }
        });
        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this, second.class);
                startActivity(in);
            }
        });
        third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this, Third.class);
                startActivity(in);
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this, Fourth.class);
                startActivity(in);
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this, Fifth.class);
                startActivity(in);
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this, Sixtht.class);
                startActivity(in);
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this, Seventh.class);
                startActivity(in);
            }
        });
        abut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this, About.class);
                startActivity(in);
            }
        });
    }
}