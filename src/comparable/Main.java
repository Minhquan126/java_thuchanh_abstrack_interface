package comparable;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new  ComparableCircle(3);
        circles[1] = new  ComparableCircle(4);
        circles[2] = new  ComparableCircle(2);
        System.out.println("pre_sorted");
        for (ComparableCircle comparableCircle:circles
             ) {
            System.out.println(comparableCircle);
        }
        System.out.println("after_sorted");
        Arrays.sort(circles);
        for (ComparableCircle comparableCircle:circles
        ) {
            System.out.println(comparableCircle);
        }
    }
}
