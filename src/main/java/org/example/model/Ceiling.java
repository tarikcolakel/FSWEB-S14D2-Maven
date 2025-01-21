package org.example.model;

import org.example.model.enums.PaintColor;

public class Ceiling {
    private int height;         // Tavan yüksekliği
    private PaintColor color;   // Tavan rengi

    // Constructor
    public Ceiling(int height, PaintColor color) {
        this.height = height;
        this.color = color;
    }

    // Yükseklik değerini dönen getter
    public int getHeight() {
        return height;
    }

    // Renk değerini dönen getter
    public PaintColor getColor() {
        return color;
    }

    // Tavanın inşa edildiğini simüle eden metod
    public void create() {
        System.out.println("Ceiling has been built.");
    }
}
