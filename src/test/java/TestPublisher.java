import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TestPublisher {

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
    public void publisherStockStartsEmpty(){
        assertEquals(0, publisher.checkInventory());
    }

    @Test
    public void canAddInventory(){
        publisher.addInventory(book1);
        assertEquals(1 , publisher.checkInventory());
    }

    @Test
    public void canRemoveInventory(){
        publisher.addInventory(book1);
        publisher.removeInventory(book1);
        assertEquals(0 , publisher.checkInventory());
        assertEquals(book1, publisher.removeInventory(book1));
    }
}

