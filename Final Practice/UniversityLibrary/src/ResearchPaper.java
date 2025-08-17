// ResearchPaper Class
class ResearchPaper extends LibraryResource {
    private String DOI;
    private int citations;

    public ResearchPaper(String title, String author, int publishYear, String DOI, int citations) {
        super(title, author, publishYear);
        this.DOI = DOI;
        this.citations = citations;
    }

    @Override
    public String getDetails() {
        return "Research Paper: " + title + " by " + author + " (" + publishYear + "), DOI: " + DOI + ", Citations: " + citations;
    }

    @Override
    public double calculateReadTime() {
        return 60; // fixed ~1 hour average read time
    }
}