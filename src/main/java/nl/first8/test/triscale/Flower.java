package nl.first8.test.triscale;

public class Flower {
    private String id;
    private String name;
    private String color;

    public Flower() {
        // Here for Jackson
    }

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
