import java.util.ArrayList;

public class Publisher {

    String name;
    ArrayList<Book> inventory;


    public Publisher(String inputName){
        this.name = inputName;
        this.inventory = new ArrayList<>();
    }


    public int checkInventory(){
        return this.inventory.size();
    }

    public void addInventory(Book inputBook) {
        this.inventory.add(inputBook);

    }

    public Book removeInventory(Book inputBook) {
        this.inventory.remove(inputBook);
        return inputBook;
    }
}
