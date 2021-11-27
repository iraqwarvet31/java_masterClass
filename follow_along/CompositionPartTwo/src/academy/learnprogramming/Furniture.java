package academy.learnprogramming;

public class Furniture {
    private String type;
    private String color;
    private String size;

    public Furniture(String type, String color, String size) {
        this.type = type;
        this.color = color;
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }
}
