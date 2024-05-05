public class Book implements Resource, Readable, Borrowable {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void read() {
        // Implementation to read a book
        System.out.println("Reading book: " + title);
    }

    @Override
    public void borrow() {
        // Implementation to borrow a book
        System.out.println("Borrowing book: " + title);
    }
}
