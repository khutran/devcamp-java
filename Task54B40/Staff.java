package Task54B40;

// File: Staff.java
public class Staff extends Person {
    // Các thuộc tính riêng của Staff
    private String school;
    private double pay;

    // Hàm khởi tạo: sử dụng super() để gọi constructor của lớp cha
    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    // Các phương thức Getter và Setter
    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    // Ghi đè toString: Sử dụng super.toString() để tái sử dụng thông tin của Person
    @Override
    public String toString() {
        return "Staff[" + super.toString() + ",school=" + school + ",pay=" + pay + "]";
    }
}