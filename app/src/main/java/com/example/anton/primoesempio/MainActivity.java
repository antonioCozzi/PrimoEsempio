package com.example.anton.primoesempio;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by anton on 08/02/2017.
 */

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button change, go, call, send;
    TextView name, position, date, tel_num;

    protected void onCreate(Bundle savedInstanceState) {
        setTitle(R.string.app_name);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        change = (Button) findViewById(R.id.change);
        change.setOnClickListener(this);

        go = (Button) findViewById(R.id.go);
        go.setOnClickListener(this);

        call = (Button) findViewById(R.id.call);
        call.setOnClickListener(this);

        send = (Button) findViewById(R.id.email);
        send.setOnClickListener(this);

        name = (TextView) findViewById(R.id.name);
        position = (TextView) findViewById(R.id.position);
        date = (TextView) findViewById(R.id.date);
        tel_num = (TextView) findViewById(R.id.phone_number);
    }

        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.change:
                    Intent intent = new Intent(MainActivity.this, RelativeActivity.class);
                    startActivity(intent);
                    break;
                case R.id.call :
                    Intent intent2 = new Intent();
                    intent2.setAction(Intent.ACTION_VIEW);
                    Uri uri = Uri.parse("tel:"+tel_num.getText().toString());
                    intent2.setData(uri);
                    startActivity(intent2);
                    break;
                case R.id.go:
                    Intent intent3 = new Intent();
                    intent3.setAction(Intent.ACTION_VIEW);
                    Uri uri2 = Uri.parse("geo: 0,0?q=m"+position.getText().toString());
                    intent3.setData(uri2);
                    startActivity(intent3);
                    break;
                case R.id.email:
                    Intent intent4 = new Intent();
                    intent4.setAction(Intent.ACTION_VIEW);
                    Uri uri3 = Uri.parse("mailto:"+send.getText().toString());
                    intent4.setData(uri3);
                    startActivity(intent4);
        }

    }
}
