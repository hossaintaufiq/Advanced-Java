package Student;


public class Student {
    private String name;
   private String ID;
   private String dept;

    public Student() {
       this.name = "";
       this.ID = "";
       this.dept = "";
    }


   public Student(String name, String ID, String dept) {
       this.name = name;
       this.ID = ID;
       this.dept = dept;
   }

   public void setName(String name) {
       this.name = name;
   }  
    public String getName() {
       return name;
   }

    public void setID(String ID) {
         this.ID = ID;
    }  
     public String getID() {
         return ID;
    }
   public void setDept(String dept) {
       this.dept = dept;
   }
   public String getDept() {
       return dept;
   }

   public void printInfo() {
       System.out.println("Name: " + name);
       System.out.println("ID: " + ID);
       System.out.println("Department: " + dept);
   }
}
