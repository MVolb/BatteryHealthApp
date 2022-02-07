package com.example.batteryhealthapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.BatteryManager;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Context context;
    TextView batteryType;
    TextView batteryHealth;
    TextView batteryLevel;

    private BroadcastReceiver receiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {

            STATUS batteryHealth;
            String loadingLevel = "";

            // get loading level of battery
            int level = intent.getIntExtra(BatteryManager.EXTRA_LEVEL,0);

            // get health condition of battery
            int health = intent.getIntExtra(BatteryManager.EXTRA_HEALTH,0);

            if (health == BatteryManager.BATTERY_HEALTH_COLD){
                batteryHealth = STATUS.RED;
            }
            if (health == BatteryManager.BATTERY_HEALTH_DEAD) {
                batteryHealth = STATUS.RED;
            }
            if (health == BatteryManager.BATTERY_HEALTH_GOOD) {
                batteryHealth = STATUS.GREEN;
            }
            if (health == BatteryManager.BATTERY_HEALTH_OVERHEAT) {
                batteryHealth = STATUS.RED;
            }
            if (health == BatteryManager.BATTERY_HEALTH_OVER_VOLTAGE) {
                batteryHealth = STATUS.RED;
            }
            if (health == BatteryManager.BATTERY_HEALTH_UNKNOWN) {
                batteryHealth = STATUS.UNKNOWN;
            }
            if (health == BatteryManager.BATTERY_HEALTH_UNSPECIFIED_FAILURE) {
                batteryHealth = STATUS.UNKNOWN;
            }

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}