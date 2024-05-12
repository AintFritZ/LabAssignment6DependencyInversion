class Student {
    private String name;
    private String id;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }
    public void borrowResource(Resource resource) {
        resource.borrow();
    }
}
