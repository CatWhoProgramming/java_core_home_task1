package Task2;

public class Rectangle {
    private double side1;
    private double side2;

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public double areaCalculator() {
        return this.side1 * this.side2;
    }

    public double perimeterCalculator() {
        return (this.side1 + this.side2) * 2;
    }
}
