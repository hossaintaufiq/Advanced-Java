package Student;

public class StudentMain {
    public static void main(String[] args) {
        // Create a Student object using the default constructor
        Student student1 = new Student();
        student1.setName("Alice");
        student1.setID("S12345");
        student1.setDept("Computer Science");
        
        // Print the information of student1
        System.out.println("Student 1 Information:");
        student1.printInfo();
        
        // Create a Student object using the parameterized constructor
        Student student2 = new Student("Bob", "S67890", "Mathematics");
        
        // Print the information of student2
        System.out.println("\nStudent 2 Information:");
        student2.printInfo();
    }
}
