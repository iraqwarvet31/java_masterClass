package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Furniture couch = new Furniture("Sofa", "Blue", "Large");
        TV tv = new TV("Samsung", "80 inch", "1440 x 2560");

        Room livingRoom = new Room(couch, tv);

        livingRoom.turnTVon();
        System.out.println(livingRoom.getFurniture());
    }


}
