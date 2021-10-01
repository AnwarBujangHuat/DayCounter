package com.example.daycounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    long daycounter;
    Calendar calendar;
    Calendar currentdate;
    TextView tv_countdown;
    TextView tv_count;
    TextView tv_countdown2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        tv_countdown = (TextView) findViewById(R.id.tv_countdown);
        tv_countdown2 = (TextView) findViewById(R.id.tv_countdown2);
        tv_count = (TextView) findViewById(R.id.tv_count);

        calendar = Calendar.getInstance(Locale.getDefault());
        currentdate = Calendar.getInstance();

        currentdate.set(2021, 9, 1);
        final long initial_dayinMili = calendar.getTimeInMillis();
        Long currentdateInMili= currentdate.getTimeInMillis();


        daycounter = (currentdateInMili-initial_dayinMili)/(1000*60*60*24);
        Long currentdateInDay=currentdateInMili/(1000*60*60*24);
        Long initial_day=initial_dayinMili/(1000*60*60*24);

        tv_countdown.setText(String.valueOf(currentdateInDay));
        tv_countdown2.setText(String.valueOf(initial_day));
        tv_count.setText(String.valueOf(daycounter));





    }}