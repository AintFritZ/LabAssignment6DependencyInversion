public class TestProgram {
    public static void main(String[] args) {
        Student student = new Student();

        Book book = new Book("Introduction to Java");
        student.borrowResource(book);

        Journal journal = new Journal("Science Journal");
        student.readResource(journal);
    }
}