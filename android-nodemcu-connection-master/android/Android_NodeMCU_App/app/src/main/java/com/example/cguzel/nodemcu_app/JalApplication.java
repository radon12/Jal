package com.example.cguzel.nodemcu_app;

import android.app.Application;

public class JalApplication extends Application{
    private double calibration = 0;
    private double phSensor = 7;
    private double phSensor_read = 7;
    public double getCalibration() {
        return calibration;
    }

    public void setCalibration(double calibration) {
        this.calibration = calibration;
    }

    public double getphSensor() {
        return phSensor ;
    }

    public double getphSensor_read() {
        return phSensor_read ;
    }

    public void setPhSensor(double read) {
        this.phSensor = read + calibration;
        this.phSensor_read = read;
    }
}