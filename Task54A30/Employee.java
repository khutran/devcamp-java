package Task54A30;

public class Employee {
    // Các thuộc tính (Fields)
    private int id;
    private String firstName;
    private String lastName;
    private int salary; // Lương tháng

    // Phương thức khởi tạo (Constructor)
    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    // Getter và Setter
    public int getID() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    // --- Các phương thức bổ sung theo yêu cầu ---

    // Trả ra tên đầy đủ: "firstName lastName"
    public String getName() {
        return firstName + " " + lastName;
    }

    // Trả ra lương 1 năm: salary * 12
    public int getAnnualSalary() {
        return salary * 12;
    }

    // Tăng lương theo phần trăm và trả về lương mới
    public int raiseSalary(int percent) {
        // Công thức: lương mới = lương cũ * (1 + % / 100)
        double increaseFactor = 1 + (percent / 100.0);
        this.salary = (int) (this.salary * increaseFactor);
        return this.salary;
    }

    // Phương thức toString trả về chuỗi mô tả đối tượng
    @Override
    public String toString() {
        return "Employee[id=" + id + ",name=" + getName() + ",salary=" + salary + "]";
    }
}