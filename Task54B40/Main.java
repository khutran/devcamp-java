package Task54B40;

// File: Main.java
public class Main {
    public static void main(String[] args) {

        // --- subTask 5: Khởi tạo và in thông tin 2 đối tượng Person ---
        Person person1 = new Person("Nguyen Van A", "123 Ly Tu Trong, Q.1");
        Person person2 = new Person("Le Thi B", "456 Tran Hung Dao, Q.5");

        System.out.println("----- PERSON OBJECTS -----");
        System.out.println(person1.toString());
        System.out.println(person2.toString());
        System.out.println();

        // --- subTask 6: Khởi tạo và in thông tin 2 đối tượng Student ---
        Student student1 = new Student("Tran Van C", "789 Cach Mang Thang 8", "IT", 2023, 15000000.0);
        Student student2 = new Student("Pham Thi D", "101 Nguyen Hue", "Marketing", 2024, 12000000.0);

        System.out.println("----- STUDENT OBJECTS -----");
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println();

        // --- subTask 7: Khởi tạo và in thông tin 2 đối tượng Staff ---
        Staff staff1 = new Staff("Hoang Van E", "202 Dien Bien Phu", "FPT Polytechnic", 20000000.0);
        Staff staff2 = new Staff("Vu Thi F", "303 Hai Ba Trung", "HUTECH", 18000000.0);

        System.out.println("----- STAFF OBJECTS -----");
        System.out.println(staff1.toString());
        System.out.println(staff2.toString());
    }
}
