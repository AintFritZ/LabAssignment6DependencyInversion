public class Journal implements Resource, Readable, Borrowable {
    private String title;

    public Journal(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void read() {
        System.out.println("Reading the journal: " + title);
    }

    @Override
    public void borrow() {
        System.out.println("Borrowing  the journal: " + title);
    }
}