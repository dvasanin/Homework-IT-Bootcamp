package Domaci.Nedelja5;

public class Rectangle extends Shape {
    private double a, b;

    public Rectangle(String name, double a, double b) {
        super(name);
        this.a=a;
        this.b=b;
    }

    @Override
    public double area() {
        return a*b;
    }

    @Override
    public double circumference() {
        return 2*(a+b);
    }
}