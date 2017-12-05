import java.util.ArrayList;

public class Library {

    private String name;
    private ArrayList<Book> stock;
    private int shelfSpace;


    public Library(String inputName) {
        this.name = inputName;
        this.stock = new ArrayList<>();
        this.shelfSpace = 3;
    }

    public int checkStock(){
        return this.stock.size();
    }


    public void addStock(Book inputBook) {
        this.stock.add(inputBook);
    }

    public int space() {
       return (this.shelfSpace - this.stock.size());
    }


    public boolean isFull() {
        return space() < 1;
    }


    public void buyBook(Publisher inputPublisher, Book inputBook){
        if (space() > 0){
            Book bookToAdd = inputPublisher.removeInventory(inputBook);
            addStock(bookToAdd);
        }
    }


}


