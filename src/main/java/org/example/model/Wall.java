package org.example.model;

public class Wall {
    private String direction; // Duvarın yönü (ör. North, South)

    // Constructor
    public Wall(String direction) {
        this.direction = direction;
    }

    // Yön değerini dönen getter
    public String getDirection() {
        return direction;
    }

    // Duvarın inşa edildiğini simüle eden metod
    public void create() {
        System.out.println("Wall has been built.");
    }
}
