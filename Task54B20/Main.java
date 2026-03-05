package Task54B20;

// File: Main.java
public class Main {
    public static void main(String[] args) {
        // --- subTask 4: Khởi tạo và in thông tin 3 đối tượng Circle ---
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(2.0);
        Circle circle3 = new Circle(3.0, "green");

        System.out.println("----- CIRCLE OBJECTS -----");
        System.out.println(circle1.toString() + " | Area: " + circle1.getArea());
        System.out.println(circle2.toString() + " | Area: " + circle2.getArea());
        System.out.println(circle3.toString() + " | Area: " + circle3.getArea());

        // --- subTask 5: Khởi tạo và in thông tin 4 đối tượng Cylinder ---
        Cylinder cylinder1 = new Cylinder();
        Cylinder cylinder2 = new Cylinder(2.5);
        Cylinder cylinder3 = new Cylinder(3.5, 1.5);
        Cylinder cylinder4 = new Cylinder(3.5, 1.5, "green");

        System.out.println("\n----- CYLINDER OBJECTS -----");
        // In toString và getVolume cho các đối tượng
        System.out.println(cylinder1.toString() + " | Volume: " + cylinder1.getVolume());
        System.out.println(cylinder2.toString() + " | Volume: " + cylinder2.getVolume());
        System.out.println(cylinder3.toString() + " | Volume: " + cylinder3.getVolume());
        System.out.println(cylinder4.toString() + " | Volume: " + cylinder4.getVolume());
    }
}