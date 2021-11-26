public class Point {
    private int x;
    private int y;

    public Point() {
        this(0, 0);
    }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }
    public int getY() {
        return this.y;
    }
    public void setX(int value) {
        this.x = value;
    }
    public void setY(int value) {
        this.y = value;
    }
    public void test() {
        System.out.println();
    }
    public double distance() {
        return Math.sqrt((Math.pow((Math.sqrt(0) - this.x), 2)) + (Math.pow((Math.sqrt(0) - this.y), 2)));
    }
    public double distance(int x, int y) {
        double result = Math.sqrt(Math.pow((Math.sqrt(x) - this.x), 2) + (Math.pow((Math.sqrt(y) - this.y), 2)));
        return (int) result;
    }
    public double distance(Point p) {
        double result = Math.sqrt(Math.pow((Math.sqrt(p.getX()) - this.x), 2) + (Math.pow((Math.sqrt(p.getY()) - this.y), 2)));
        return (int) result;
    }
}
