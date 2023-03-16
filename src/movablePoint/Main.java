package movablePoint;

public class Main {
    public static void main(String[] args) {
        System.out.println("====Point=====");
        Point point = new Point(2,3);
        System.out.println(point);
        System.out.println("=====MovablePoint======");
        MovablePoint movablePoint = new MovablePoint(2,3,4,5);
        System.out.println(movablePoint);
    }
}
