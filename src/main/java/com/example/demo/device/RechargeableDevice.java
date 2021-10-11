package com.example.demo.device;

import com.example.demo.ExternalSource.ExternalSource;
import com.example.demo.battery.RechargeableBattery;

public class RechargeableDevice extends Device implements RechargeableBattery, ExternalSource {

    @Override
    public void printPowerStatus() {

    }

    @Override
    public void printBatteryPercentage() {

    }

    @Override
    public void printBatteryStatus() {

    }
}
