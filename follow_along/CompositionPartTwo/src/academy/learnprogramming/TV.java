package academy.learnprogramming;

public class TV {
    private String brand;
    private String size;
    private String resolution;

    public TV(String brand, String size, String resolution) {
        this.brand = brand;
        this.size = size;
        this.resolution = resolution;
    }

    public String getBrand() {
        return brand;
    }

    public String getSize() {
        return size;
    }

    public String getResolution() {
        return resolution;
    }
    public void powerOn() {
        System.out.println("TV is now on....");
    }
}
