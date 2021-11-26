import jdk.swing.interop.SwingInterOpUtils;

public class Main {
    public static void main(String[] args) {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);

        System.out.println("distance() = " + first.distance());
        System.out.println("distance(2, 2) = " + first.distance(2, 2));
        System.out.println("distance(second) = " + first.distance(second));

        Point point = new Point();
        System.out.println("distance() = " + point.distance());

        Point third = new Point(1, -1);
        System.out.println(third.distance());
    }
}

/*
6x1, 0y1
0x2, 5y2

1x1, -1y1
*/
