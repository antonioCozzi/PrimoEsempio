package com.example.anton.primoesempio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import static android.view.View.INVISIBLE;
import static android.view.View.VISIBLE;

/**
 * Created by anton on 08/02/2017.
 */

public class RelativeActivity extends AppCompatActivity {

    boolean giaMandato = false;

    protected void onCreate(Bundle savedInstanceState) {
        setTitle(R.string.app_name);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative);

        final ImageView image = (ImageView) findViewById(R.id.image);
        image.setVisibility(View.INVISIBLE);
        final Button fattiMandare = (Button) findViewById(R.id.fattiMandare);

    fattiMandare.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (giaMandato = true) {
                Toast.makeText(RelativeActivity.this, getString(R.string.gia_mandato), Toast.LENGTH_SHORT).show();
                finish();
                if (image.getVisibility() == View.INVISIBLE) {
                    image.setVisibility(VISIBLE);
                } else {
                    image.setVisibility(INVISIBLE);
                }
            }
        }
    });
        fattiMandare.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(RelativeActivity.this, getString(R.string.smettila), Toast.LENGTH_SHORT).show();
                giaMandato = true;
                finish();
                return false;
            }
        });


    }
}