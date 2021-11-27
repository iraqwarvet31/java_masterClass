package academy.learnprogramming;

public class Room {
    private Furniture furniture;
    private TV tv;

    public Room(Furniture furniture, TV tv) {
        this.furniture = furniture;
        this.tv = tv;
    }

    public void turnTVon() {
        System.out.println("Pressing TV power button...");
        tv.powerOn();
    }
}
