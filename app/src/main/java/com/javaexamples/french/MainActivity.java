package com.javaexamples.french;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.Button;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button blackButton = findViewById(R.id.blackBtn);
        blackButton.setOnClickListener(new View.OnClickListener() {
    public void onClick(View v) {
        Toast.makeText(getApplicationContext(),"You clicked",Toast.LENGTH_LONG).show();
        MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.black);
        mediaPlayer.start();


    }

        });
        Button redButton = findViewById(R.id.redBtn);
        redButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"You clicked",Toast.LENGTH_LONG).show();
                MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.red);
                mediaPlayer.start();


            }

        });
        Button yellowButton = findViewById(R.id.yellowBtn);
        yellowButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"You clicked",Toast.LENGTH_LONG).show();
                MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.yellow);
                mediaPlayer.start();


            }

        });
        Button purpleButton = findViewById(R.id.purpleBtn);
        purpleButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"You clicked",Toast.LENGTH_LONG).show();
                MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.purple);
                mediaPlayer.start();


            }

        });
        Button greenButton = findViewById(R.id.greenBtn);
        greenButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"You clicked",Toast.LENGTH_LONG).show();
                MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.green);
                mediaPlayer.start();


            }

        });
    }
}