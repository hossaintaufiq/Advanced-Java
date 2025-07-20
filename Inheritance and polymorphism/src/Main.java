public class Main {
    public static void main(String[] args) {
        // ✅ 1. Normal use
        Circle c1 = new Circle(3.0, "Blue", true);
        Rectangle r1 = new Rectangle(4.0, 5.0, "Green", false);

        System.out.println("Circle:");
        System.out.println(c1.toString());
        c1.printCircle();

        System.out.println("\nRectangle:");
        System.out.println(r1.toString());
        r1.printRectangle();

        System.out.println("\n--- POLYMORPHISM ---");
        // ✅ 2. Polymorphism: superclass reference to subclass object
        GeometricObject obj1 = new Circle(2.5, "Yellow", true);
        GeometricObject obj2 = new Rectangle(6.0, 7.0, "Purple", true);

        System.out.println(obj1.toString());  // Calls Circle's toString()
        System.out.println(obj2.toString());  // Calls Rectangle's toString()

        // ✅ 3. instanceof + casting
        if (obj1 instanceof Circle) {
            Circle circleObj = (Circle) obj1; // Explicit cast
            System.out.println("Area of obj1 Circle: " + circleObj.getArea());
        }

        if (obj2 instanceof Rectangle) {
            Rectangle rectObj = (Rectangle) obj2; // Explicit cast
            System.out.println("Area of obj2 Rectangle: " + rectObj.getArea());
        }

        System.out.println("\n--- Dynamic Binding ---");
        // ✅ 4. Dynamic binding: the actual type determines which toString() runs
        GeometricObject[] shapes = { new Circle(1.0, "Red", true), new Rectangle(2.0, 3.0, "Blue", false) };

        for (GeometricObject shape : shapes) {
            System.out.println(shape.toString()); // Which toString runs depends on actual object
        }
    }
}