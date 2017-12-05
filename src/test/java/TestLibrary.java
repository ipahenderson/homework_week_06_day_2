import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestLibrary {

    Library library;
    Book book1;
    Book book2;
    Book book3;
    Book book4;
    Publisher publisher;


    @Before
    public void before(){
        library = new Library("Morningside Library");
        book1 = new Book("The Picture of Dorian Grey", "Oscar Wilde");
        book2 = new Book("The Great Gatsby", "F.Scott Fitsgerald");
        book3 = new Book("Java for Dummies", "Barry A. Burd");
        book4 = new Book ("Quick Meals", "A. S. Petey Cooke");
        publisher = new Publisher("Penguin Books");
    }

    @Test
    public void libraryStockStartsEmpty(){
        assertEquals(0, library.checkStock());
    }

    @Test
    public void canAddStock(){
        library.addStock(book1);
        assertEquals(1 , library.checkStock());
    }


    @Test
    public void checkSpace(){
        library.addStock(book1);
        library.addStock(book2);
        library.addStock(book3);
        assertEquals(0 , library.space());
    }

    @Test
    public void checkIfFull(){
        library.addStock(book1);
        library.addStock(book2);
        library.addStock(book3);
        library.addStock(book4);
        assertEquals(true, library.isFull());
    }


    @Test
    public void canBuyBook() {
        publisher.addInventory(book1);
        library.buyBook(publisher, book1);
        assertEquals(0, publisher.checkInventory());
        assertEquals(1, library.checkStock());
    }
}





