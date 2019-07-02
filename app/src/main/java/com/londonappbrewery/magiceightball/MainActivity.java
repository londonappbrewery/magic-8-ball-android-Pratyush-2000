package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button askButton=(Button)findViewById(R.id.button2);
       final ImageView result=(ImageView)findViewById(R.id.imageView);
        TextView welcome=(TextView)findViewById(R.id.textView);

       final int[] buttonArray={R.drawable.ball1,R.drawable.ball2,
                R.drawable.ball3,R.drawable.ball4,R.drawable.ball5};

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rng=new Random();
                int number=rng.nextInt(5);
                result.setImageResource(buttonArray[number]);


            }
        });

    }
}
