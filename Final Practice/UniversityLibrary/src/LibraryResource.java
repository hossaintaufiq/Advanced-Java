// Base Class
abstract class LibraryResource {
    protected String title;
    protected String author;
    protected int publishYear;

    public LibraryResource(String title, String author, int publishYear) {
        this.title = title;
        this.author = author;
        this.publishYear = publishYear;
    }

    public int getAge() {
        return 2025 - publishYear; // current year assumed 2025
    }

    public abstract String getDetails();
    public abstract double calculateReadTime();
}
