// Magazine Class
class Magazine extends LibraryResource {
    private int issueNumber;
    private int totalPages;

    public Magazine(String title, String author, int publishYear, int issueNumber, int totalPages) {
        super(title, author, publishYear);
        this.issueNumber = issueNumber;
        this.totalPages = totalPages;
    }

    @Override
    public String getDetails() {
        return "Magazine: " + title + " by " + author + " (" + publishYear + "), Issue: " + issueNumber + ", Pages: " + totalPages;
    }

    @Override
    public double calculateReadTime() {
        return totalPages * 1.0; // assuming 1 minute per page
    }
}