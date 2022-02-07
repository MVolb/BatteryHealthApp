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

            batteryHealth = StatusMapper.getBatteryStatus(health);


        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}