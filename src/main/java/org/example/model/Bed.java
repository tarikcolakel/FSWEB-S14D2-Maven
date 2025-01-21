package org.example.model;

public class Bed {
    private String style;    // String tipi
    private int pillows;     // int tipi
    private int height;      // int tipi
    private int sheets;      // int tipi
    private int quilts;      // int tipi

    // Constructor
    public Bed(String style, int pillows, int height, int sheets, int quilts) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilts = quilts;
    }

    // Getter metodları
    public String getStyle() {
        return style;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilts() {
        return quilts;
    }

    public int getPillows() {
        return pillows;
    }

    // make metodu
    public void make() {
        System.out.println("The bed is being made.");
    }
}
