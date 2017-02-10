package com.example.anton.primoesempio;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by anton on 08/02/2017.
 */

public class MainActivity extends AppCompatActivity{

    int size = 0;

    protected void onCreate(Bundle savedInstanceState){
        setTitle(R.string.app_name);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView title = (TextView) findViewById(R.id.title);
        final TextView subtitle = (TextView) findViewById(R.id.subtitle);
        final TextView date = (TextView) findViewById(R.id.date);
        final TextView loremIpsum = (TextView) findViewById(R.id.loremIpsum);
        final Button read = (Button) findViewById(R.id.read);
        final Button change = (Button) findViewById(R.id.change);

        read.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                size += 1;
                loremIpsum.setTextSize(size);
            }
        });

        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RelativeActivity.class);
                startActivity(intent);
            }
        });

    }
}
