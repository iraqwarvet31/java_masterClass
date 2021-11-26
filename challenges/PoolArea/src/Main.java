public class Main {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(5, 10);
        System.out.println("rec width: " + rec.getWidth());
        System.out.println("rec length: " + rec.getLength());
        System.out.println("rec area: " + rec.getArea());

        Cuboid cuboid = new Cuboid(5, 10, 5);
        System.out.println("cuboid width: " + cuboid.getWidth());
        System.out.println("cuboid length: " + cuboid.getLength());
        System.out.println("cuboid area: " + cuboid.getArea());
        System.out.println("cuboid height: " + cuboid.getHeight());
        System.out.println("cuboid volume: " + cuboid.getVolume());
    }
}
