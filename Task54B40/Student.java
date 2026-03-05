package Task54B40;

// File: Student.java
public class Student extends Person {
    // Các thuộc tính riêng của Student
    private String program;
    private int year;
    private double fee;

    // Hàm khởi tạo: sử dụng super() để gọi constructor của lớp cha
    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    // Các phương thức Getter và Setter
    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    // Ghi đè toString: Sử dụng super.toString() để tái sử dụng thông tin của Person
    @Override
    public String toString() {
        return "Student[" + super.toString() + ",program=" + program + ",year=" + year + ",fee=" + fee + "]";
    }
}