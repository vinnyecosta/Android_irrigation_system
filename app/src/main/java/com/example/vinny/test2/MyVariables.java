package com.example.vinny.test2;

import android.app.Application;



public class MyVariables extends Application
{

    public int  weekday;
    public int  sethour;
    public int  setminute;
    public int  sethouron;
    public int  setminuteon;
    public int  add_remove;

    public enum ESP_days{
        sunday,
        monday,
        tuesday,
        wednesday,
        thursday,
        friday,
        saturday
    }

    public int getMyVariable() {

        return weekday;
    }

    public void setTabday_f(int someVariable) {

        this.weekday = someVariable;
    }

    public void setTime_f(int v0, int v1) {

        this.sethour = v0;
        this.setminute = v1;
        this.add_remove = 1;
    }
    public void setonTime_f(int v0, int v1) {

        this.sethouron = v0;
        this.setminuteon = v1;
        this.add_remove = 1;
    }
}
