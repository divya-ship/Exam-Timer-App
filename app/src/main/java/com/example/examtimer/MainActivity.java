package com.example.examtimer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

import java.util.concurrent.CountDownLatch;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final  TextView  done=findViewById(R.id.done);

       final TextView countdown=findViewById(R.id.mnumber);
     //countdown timer
        new CountDownTimer(20000,1000){

            public void onTick(long millisecondsUnitDone){
                countdown.setText("Time"+ "   "+String.valueOf(millisecondsUnitDone/1000));
            }
            public void onFinish(){
                done.setText("Your Done Now!!");
            }
        }.start();


    }
}
