public class Showroom {
    private String name;
    private String location ;
    private double rent ;

    public Showroom(){

    }
    public Showroom(String name, String location, double rent){
        this.name=name;
        this.location=location;
        this.rent=rent;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public double getRent() {
        return rent;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }
    public double calculateYearlyRent(){
        return rent*12;
    }

    public void displayInfo(){
        System.out.println("Name: "+name);
        System.out.println("Location: "+location);
        System.out.println("Yearly Rent: "+calculateYearlyRent());
    }
}
