public class Student {
    public void borrowResource(Borrowable resource) {
        resource.borrow();
    }

    public void readResource(Readable resource) {
        resource.read();
    }
}