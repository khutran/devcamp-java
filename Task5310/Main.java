public class Main {
    public static void main(String[] args) {
        // Khởi tạo đối tượng person1 sử dụng constructor KHÔNG tham số
        Person person1 = new Person();

        // Cập nhật thông tin cho person1 bằng Setter (nếu muốn)
        person1.setName("Nguyen Van A");
        person1.setAge(20);

        // Khởi tạo đối tượng person2 sử dụng constructor CÓ tham số
        // Thứ tự: name, height, weight, gender, age
        Person person2 = new Person("Tran Thi B", 1.65, 55.0, "Female", 25);

        // In đối tượng ra console bằng phương thức toString
        System.out.println("Thông tin Person 1:");
        System.out.println(person1.toString());

        System.out.println("\nThông tin Person 2:");
        System.out.println(person2.toString());
    }
}