public class Circle extends GeometricObject{
    private double radius;

    public  Circle(){

    }
    public Circle(double radius,String color, boolean filled){
        super(color,filled);
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return 3.14*radius*radius;
    }

    public double getPerimeter(){
        return 2*3.14*radius;
    }

    public double getDiameter(){
        return 2*radius;
    }

    public void printCircle(){
        System.out.println(super.toString()+ " \n Area = "+getArea()+ " Perimeter = "+getPerimeter()+ " Diameter = "+getDiameter());
    }
}
