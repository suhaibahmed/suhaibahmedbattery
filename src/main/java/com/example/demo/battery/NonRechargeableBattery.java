package com.example.demo.battery;

public interface NonRechargeableBattery extends Battery {
    public default void printBatteryStatus(){
        System.out.print("Battery is discharging");
    }
}
