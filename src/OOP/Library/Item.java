package OOP.Library;

public class Item {
    protected String title;
    public Item(String title) {
        this.title = title;
    }
    public void displayInfo() {
        System.out.println("Title: " + title);
    }
}
