package com.example.daniel.alarmclockapp;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TimePicker;

import java.sql.Time;

public class settingAlarm extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = ".";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alarm_set);
    }

    //Response to button
    @TargetApi(Build.VERSION_CODES.M)
    public void setAlarm(View view) {
        TimePicker timePicker = (TimePicker) findViewById(R.id.timePicker);
        timePicker.clearFocus();
        int hour = timePicker.getHour();
        int minute = timePicker.getMinute();
        Intent intent = new Intent(this, alarmList.class);
        String time = "Alarm set for: " + String.valueOf(hour) + ":" + String.valueOf(minute);
        intent.putExtra(EXTRA_MESSAGE, time);
        startActivity(intent);
    }

}


