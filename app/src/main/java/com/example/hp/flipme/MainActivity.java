package com.example.hp.flipme;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
     ImageView imageView;
    Button b;
    Random r;
    int coinside;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.heads);
        b = (Button) findViewById(R.id.button);
        r = new Random();
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                coinside = r.nextInt(2);
                if (coinside == 0) {
                    imageView.setImageResource(R.drawable.heads);
                    Toast.makeText(MainActivity.this,"Hurray! Heads",Toast.LENGTH_LONG).show();
                } else if (coinside == 1) {
                    imageView.setImageResource(R.drawable.tails);
                    Toast.makeText(MainActivity.this,"Hurray! Tails",Toast.LENGTH_LONG).show();
                }
               /* RotateAnimation rotate = new RotateAnimation(0, 360, RotateAnimation.RELATIVE_TO_SELF,
                        0.5f, RotateAnimation.RELATIVE_TO_SELF, 0.5f);
                rotate.setDuration(2000);
                imageView.startAnimation(rotate);*/



            }
        });
    }

    }