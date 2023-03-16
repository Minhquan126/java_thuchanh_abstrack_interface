package circle;

public class Cylinder extends Circle {


    private double height;
    public double volume;

    public Cylinder (double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume() {
        this.volume = getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", volume=" + getVolume() + "and" +
                super.toString();
    }
}
