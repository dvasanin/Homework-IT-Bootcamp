package Domaci.Nedelja5;

public abstract class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double circumference();

    public abstract double area();

    @Override
    public String toString() {
        return "Shape: " + this.name + "\n" + "Circumference: " + circumference() + "\n" + "Area: " + area() + "\n" + "-----------------";
    }
}