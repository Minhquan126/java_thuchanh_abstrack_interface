package circle;

public class Circle {
    private double radius;
    private String color;
    public double area;
    public Circle(double radius) {
this.radius = radius;
    }
    public Circle ( double radius,String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }
    public void setArea() {
        this.area = radius*Math.pow(radius,2)*Math.PI;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return area;
    }
    @Override
    public String toString() {
        return " A circle with radius = " + getRadius() + ", color : " + getColor();
    }
}
