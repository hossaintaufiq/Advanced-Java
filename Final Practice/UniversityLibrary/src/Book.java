// Book Class
class Book extends LibraryResource {
    private String ISBN;
    private int totalPages;

    public Book(String title, String author, int publishYear, String ISBN, int totalPages) {
        super(title, author, publishYear);
        this.ISBN = ISBN;
        this.totalPages = totalPages;
    }

    @Override
    public String getDetails() {
        return "Book: " + title + " by " + author + " (" + publishYear + "), ISBN: " + ISBN + ", Pages: " + totalPages;
    }

    @Override
    public double calculateReadTime() {
        return totalPages * 1.5; // assuming 1.5 minutes per page
    }
}