package org.example.model;

public class Wardrobe {
    private int width;   // Dolabın genişliği
    private int height;  // Dolabın yüksekliği
    private double weight; // Dolabın ağırlığı

    // Constructor
    public Wardrobe(int width, int height, double weight) {
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    // Genişlik değerini döner
    public int getWidth() {
        return width;
    }

    // Yükseklik değerini döner
    public int getHeight() {
        return height;
    }

    // Ağırlık değerini döner
    public double getWeight() {
        return weight;
    }

    // Dolabı odaya ekleme işlemini simüle eden metod
    public void add() {
        System.out.println("Wardrobe added into Bedroom.");
    }
}
