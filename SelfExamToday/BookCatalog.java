
package self.model;

public class BookCatalog {

    private int numOfBooks;
    private Book books[];

    public BookCatalog(int lengthOfCatalog) {
        this.books = new Book[lengthOfCatalog];
    }

    public int size(Book[] books) {
        return books.length;
    }

    public Book[] getBooks(Book[] books) {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public int addBook(Book bookAdded) {

        int value = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = bookAdded;
                this.numOfBooks++;
                value = i;
                break;

            } else {
                value = -1;
            }
        }

        return value;

    }

    public int unAvailableBook(Book bookUnAvailable) {
    int value = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i].equals(bookUnAvailable)) {
                books[i] = null;
                this.numOfBooks++;
                value = i;
                break;

            } else {
                value = -1;
            }
        }

        return value;


    }

    @Override
    public String toString() {
        String listOfBooks = "***List of Books***\n";
        for (int i = 0; i < numOfBooks; i++) {
            listOfBooks += books[i] + "\n";
        }

        return listOfBooks;
    }

}
