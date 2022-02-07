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

        // Get the battery technology
        String  technology= intent.getExtras().getString(BatteryManager.EXTRA_TECHNOLOGY);

        // Get the battery voltage
        int  voltage= intent.getIntExtra(BatteryManager.EXTRA_VOLTAGE,0);

        // Get the battery temperature in Celsius
        int  temperature_c= (intent.getIntExtra(BatteryManager.EXTRA_TEMPERATURE,0))/10;

        // get loading level of battery
        int level = intent.getIntExtra(BatteryManager.EXTRA_LEVEL,0);

        // get health condition of battery
        int health = intent.getIntExtra(BatteryManager.EXTRA_HEALTH,0);

        batteryHealth = StatusMapper.getBatteryStatus(health);


    }
}
