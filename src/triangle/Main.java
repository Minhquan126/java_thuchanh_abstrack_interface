package triangle;

public class Main {
    public static void main(String[] args) {
        System.out.println("====Shape=====");
        Shape shape = new Shape("red",true);
        System.out.println(shape);
        System.out.println("====Trianle=====");
        Triangle triangle = new Triangle(3,4);
        System.out.println(triangle);
    }
}
