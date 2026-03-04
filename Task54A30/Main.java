package Task54A30;

public class Main {
    public static void main(String[] args) {
        // Subtask 3: Khởi tạo 2 đối tượng nhân viên với tham số tự quy định
        Employee employee1 = new Employee(101, "Nguyen", "Van An", 10000000);
        Employee employee2 = new Employee(102, "Le", "Thi Hoa", 12000000);

        // In 2 đối tượng ra console bằng toString()
        System.out.println("Thông tin NV 1 ban đầu: " + employee1.toString());
        System.out.println("Thông tin NV 2 ban đầu: " + employee2.toString());

        System.out.println("------------------------------------");

        // Subtask 4: In tên đầy đủ và lương 1 năm
        System.out.println("Nhân viên 1:");
        System.out.println("- Tên đầy đủ: " + employee1.getName());
        System.out.println("- Lương 1 năm: " + employee1.getAnnualSalary());

        System.out.println("\nNhân viên 2:");
        System.out.println("- Tên đầy đủ: " + employee2.getName());
        System.out.println("- Lương 1 năm: " + employee2.getAnnualSalary());

        System.out.println("------------------------------------");

        // Subtask 5: Tăng lương cho 2 nhân viên
        // NV1 tăng 10%, NV2 tăng 15%
        System.out.println("Đang thực hiện tăng lương...");
        employee1.raiseSalary(10);
        employee2.raiseSalary(15);

        // In lại lương sau khi tăng
        System.out.println("Lương mới của " + employee1.getName() + ": " + employee1.getSalary());
        System.out.println("Lương mới của " + employee2.getName() + ": " + employee2.getSalary());

        // Kiểm tra lại qua toString()
        System.out.println("\nThông tin sau khi tăng lương:");
        System.out.println(employee1.toString());
        System.out.println(employee2.toString());
    }
}