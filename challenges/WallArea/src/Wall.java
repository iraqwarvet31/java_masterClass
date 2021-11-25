public class Wall {
    private double width;
    private double height;

    public Wall() {
        this(0.0, 0.0);
        System.out.println("Empty constructor");
    }
    public Wall(double width, double height) {
        if (width < 0 && height < 0) {
            this.width = 0;
            this.height = 0;
        } else if (width < 0) {
            this.width = 0;
            this.height = height;
        } else if (height < 0) {
            this.height = 0;
            this.width = width;
        } else {
            this.height = height;
            this.width = width;
        }

    }

    public double getWidth() {
        return this.width;
    }
    public double getHeight() {
        return this.height;
    }
    public void setWidth(double newWidth) {
        if (newWidth < 0) {
            this.width = 0.0;
        } else {
            this.width = newWidth;
        }
    }
    public void setHeight(double newHeight) {
        if (newHeight < 0) {
            this.height = 0.0;
        } else {
            this.height = newHeight;
        }
    }
    public double getArea() {
        return this.width * this.height;
    }
}
