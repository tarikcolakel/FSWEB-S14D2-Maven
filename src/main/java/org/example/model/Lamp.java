package org.example.model;

import org.example.model.enums.LampType;

public class Lamp {
    private LampType style; // enum tipi
    private boolean battery;
    private int globRating;

    // Constructor
    public Lamp(LampType style, boolean battery, int globRating) {
        this.style = style;   // enum tipini burada alıyoruz
        this.battery = battery;
        this.globRating = globRating;
    }

    // Getter metodları
    public LampType getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }

    // turnOn metodu
    public void turnOn() {
        System.out.println("Lamp is being turned on.");
    }
}
