public class Rectangle extends  GeometricObject{
    private double width;
    private  double height;

    public Rectangle(){

    }

    public Rectangle(double height, double width, String color, boolean filled){
        super(color, filled);
        this.height=height ;
        this.width=width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return height*width;
    }

    public double getPerimeter(){
        return 2*(height+width);
    }

    public String printRectangle(){
        return super.toString() + " \n Area : "+ getArea()+ " Perimeter : "+ getPerimeter();
    }
}
