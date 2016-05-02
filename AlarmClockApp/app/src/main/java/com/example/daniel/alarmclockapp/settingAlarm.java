package com.example.daniel.alarmclockapp;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TimePicker;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


public class settingAlarm extends AppCompatActivity {

    AlarmManager alarmManager;
    private PendingIntent pendingIntent;
    public final static String EXTRA_MESSAGE = ".";
    private static settingAlarm inst;

    @Override
    public void onStart() {
        super.onStart();
        inst = this;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alarm_set);
        alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);

        // Spinner element
        Spinner spinner = (Spinner) findViewById(R.id.spinner);


        // Spinner Drop down elements
        List<String> categories = new ArrayList<String>();
        categories.add("Smoke Alarm");
        categories.add("Industrial Alarm");
        categories.add("Police Siren");
        categories.add("Toy Siren");
        categories.add("Monotone Beeps");


        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);
    }

    //Response to button
    @TargetApi(Build.VERSION_CODES.M)
    public void setAlarm(View view) {
        TimePicker timePicker = (TimePicker) findViewById(R.id.timePicker);
        timePicker.clearFocus();

        String formattedTime = "";

        int hour = timePicker.getHour();
        String sHour = "00";
        if(hour < 10){
            sHour = "0"+hour;
        } else {
            sHour = String.valueOf(hour);
        }

        int minute = timePicker.getMinute();
        String sMinute = "00";
        if(minute < 10){
            sMinute = "0"+minute;
        } else {
            sMinute = String.valueOf(minute);
        }

        formattedTime = sHour + ":" + sMinute;

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, timePicker.getHour());
        calendar.set(Calendar.MINUTE, timePicker.getMinute());

        Intent myIntent = new Intent(settingAlarm.this, AlarmReceiver.class);
        pendingIntent = PendingIntent.getBroadcast(settingAlarm.this, 0, myIntent, 0);
        alarmManager.set(AlarmManager.RTC, calendar.getTimeInMillis(), pendingIntent);
        Intent intent = new Intent(this, alarmList.class);

        String time = "Alarm set for: " + formattedTime;
        intent.putExtra(EXTRA_MESSAGE, time);

        startActivity(intent);
    }

    public void cancelAlarm() {

    }

}


