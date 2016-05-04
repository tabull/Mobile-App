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
        Spinner spinner = (Spinner) findViewById(R.id.alarmSpinner);


        // Spinner Drop down elements
        List<String> alarms = new ArrayList<String>();
        alarms.add("Random");
        alarms.add("Buzzer Alarm");
        alarms.add("Industrial Alarm");
        alarms.add("Police Siren");
        alarms.add("Tornado Siren");


        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, alarms);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);

        // Spinner element
        Spinner spinner2 = (Spinner) findViewById(R.id.taskSpinner);


        // Spinner Drop down elements
        List<String> tasks = new ArrayList<String>();
        tasks.add("Random");
        tasks.add("Name the Flag");
        tasks.add("Maths Challenge");
        tasks.add("Shake");


        ArrayAdapter <String> dataAdapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, tasks);
        dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(dataAdapter2);
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


