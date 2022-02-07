package com.example.batteryhealthapp;

import android.os.BatteryManager;

public class StatusMapper {

    public static STATUS getBatteryStatus(int health) {
        STATUS batteryHealth = STATUS.GREEN;
        if (health == BatteryManager.BATTERY_HEALTH_COLD) {
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

        return batteryHealth;
    }

}
