package BookAuthorClass;

// File: Author.java
public class Author {
    // Các thuộc tính private
    private String name;
    private String email;
    private char gender; // 'm' cho nam, 'f' cho nữ

    // Hàm khởi tạo (Constructor) không có giá trị mặc định
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    // Các phương thức Getter và Setter
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    // Ghi đè phương thức toString theo định dạng: "Author[name=?,email=?,gender=?]"
    @Override
    public String toString() {
        return "Author[name=" + name + ",email=" + email + ",gender=" + gender + "]";
    }
}