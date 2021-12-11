import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceries = new ArrayList<>();

    public void addGroceryItem(String item) {
        this.groceries.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceries.size() + " grocery items");
        for (int i = 0; i < groceries.size(); i++) {
            System.out.println((i+1) + ". " + groceries.get(i));
        }
    }
    public void modifyGroceryItem(int position, String newItem) {
        groceries.set(position, newItem);
        System.out.println("Grocery item " + position+1 + " has been modified");
    }
    public void removeGroceryItem(int position) {
        String theItem = groceries.get(position);
        groceries.remove(position);
        System.out.println("Grocery list item " + position+1 + " has been removed");
    }
    public String findItem(String searchItem) {
//        boolean exists = groceries.contains(searchItem);
        int position = groceries.indexOf(searchItem);
        if (position >= 0) {
            return groceries.get(position);
        }
        return null;
    }
}
