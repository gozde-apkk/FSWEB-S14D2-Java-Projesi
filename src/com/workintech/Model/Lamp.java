package com.workintech.Model;

import com.workintech.Enum.LampType;

public class Lamp {
    private boolean battery;
    private int globRating;

    private LampType style ;

    public Lamp(boolean battery, int globRating, LampType style) {
        this.battery = battery;
        this.globRating = globRating;
        this.style = style;
    }
    public void turnOn(){
        System.out.println("Lamp is being turned on.");
    }

    public LampType getStyle(){
        return style;
    }

    public boolean isBattery(){
        return battery;
    }

    public int getGlobRating(){
        return  globRating;
    }
}
