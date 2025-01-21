package org.example.model;

import org.example.model.enums.PaintColor;

public class Carpet {
    private int width;         // Halının genişliği
    private int height;        // Halının uzunluğu
    private PaintColor color;  // Halının rengi

    // Constructor
    public Carpet(int width, int height, PaintColor color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    // Genişlik değerini döner
    public int getWidth() {
        return width;
    }

    // Uzunluk değerini döner
    public int getHeight() {
        return height;
    }

    // Renk değerini döner
    public PaintColor getColor() {
        return color;
    }

    // Halıyı yere serme işlemini simüle eden metod
    public void lying() {
        System.out.println("Carpet is lying on Bedroom floor.");
    }
}
