import java.util.ArrayList;
import java.util.List;

// Interface LibraryItem
interface LibraryItem {
    void borrowItem();
    void returnItem();
}

// Class implementing LibraryItem for Books
class Book implements LibraryItem {
    private String title;
    private boolean isBorrowed;

    public Book(String title) {
        this.title = title;
        this.isBorrowed = false;
    }

    @Override
    public void borrowItem() {
        if (!isBorrowed) {
            isBorrowed = true;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is already borrowed.");
        }
    }

    @Override
    public void returnItem() {
        if (isBorrowed) {
            isBorrowed = false;
            System.out.println(title + " has been returned.");
        } else {
            System.out.println(title + " was not borrowed.");
        }
    }
}

// Class implementing LibraryItem for Magazines
class Magazine implements LibraryItem {
    private String name;

    public Magazine(String name) {
        this.name = name;
    }

    @Override
    public void borrowItem() {
        System.out.println(name + " magazine cannot be borrowed!");
    }

    @Override
    public void returnItem() {
        System.out.println(name + " magazine does not require return.");
    }
}

public class OnlineLibrary {
    public static void main(String[] args) {
        List<LibraryItem> library = new ArrayList<>();
        library.add(new Book("The Java Handbook"));
        library.add(new Magazine("Tech World"));

        // Borrowing items
        for (LibraryItem item : library) {
            item.borrowItem();
        }

        // Returning items
        for (LibraryItem item : library) {
            item.returnItem();
        }
    }
}
