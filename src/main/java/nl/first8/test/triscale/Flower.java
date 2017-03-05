/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.first8.test.triscale;

/**
 *
 * @author gkok
 */
public class Flower {
    private final String id;
    private final String name;
    private final String color;

    public Flower(String id, String name, String color) {
        this.id = id;
        this.name = name;
        this.color = color;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Flower [id=" + id + ", name=" + name + ", color=" + color + "]";
    }
}
