package com.example.batteryhealthapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.BatteryManager;

public class MyBroadCastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        STATUS batteryHealth;
        String loadingLevel = "";

        // Get the battery temperature in celcius
        int  temperature_c= (intent.getIntExtra(BatteryManager.EXTRA_TEMPERATURE,0))/10;

        // get loading level of battery
        int level = intent.getIntExtra(BatteryManager.EXTRA_LEVEL,0);

        // get health condition of battery
        int health = intent.getIntExtra(BatteryManager.EXTRA_HEALTH,0);

        batteryHealth = StatusMapper.getBatteryStatus(health);


    }
}
