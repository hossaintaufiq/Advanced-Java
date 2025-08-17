//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Book book = new Book("Java Programming", "John Doe", 2018, "123-456-789", 350);
        Magazine magazine = new Magazine("Tech Monthly", "Jane Smith", 2022, 45, 120);
        ResearchPaper paper = new ResearchPaper("AI Research", "Alice Brown", 2020, "10.1234/abc123", 200);

        LibraryResource[] resources = {book, magazine, paper};

        for (LibraryResource res : resources) {
            System.out.println(res.getDetails());
            System.out.println("Age: " + res.getAge() + " years");
            System.out.println("Estimated Read Time: " + res.calculateReadTime() + " minutes\n");
        }
    }
}