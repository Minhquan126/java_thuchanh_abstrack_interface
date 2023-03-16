package circle;

public class Main {
    public static void main(String[] args) {
        System.out.println("=======Circle+++++++++");
        Circle circle = new Circle(2,"red");
        System.out.println(circle);
        System.out.println("=======Cylinder+++++++++");
        Cylinder cylinder = new Cylinder(10,2,"red");
        cylinder.setArea();
        System.out.println(circle.getArea());
        cylinder.setVolume();
        System.out.println(cylinder);
    }
}
