import gui.LoginFrame;
import model.BookStore;

public class Main {
    public static void main(String[] args) {
        BookStore store = new BookStore();
        store.loadBooks();
        store.loadCustomers();
        new LoginFrame(store).setVisible(true);
    }
}