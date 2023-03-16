package triangle;

public class Triangle {
    private double height;
    private double width;
    public double area;


    public Triangle() {
    }

    public Triangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public void setArea() {
        this.area = area;
    }
    public double getArea(){
        return (height*width)/2;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "height=" + height +
                ", width=" + width +
                ", area=" + area +
                super.toString() +
                '}';
    }
}
