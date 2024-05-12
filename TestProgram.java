public class TestProgram {
    public static void main(String[] args) {
        Student student = new Student("Etienne Banquil", "123456");

        Book book = new Book("Introduction to Java");
        Journal journal = new Journal("Nature");

        student.borrowResource(book);
        student.borrowResource(journal);
    }
}