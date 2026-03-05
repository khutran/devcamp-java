package Task54B40;

// File: Person.java
public class Person {
    // Các thuộc tính private
    private String name;
    private String address;

    // Hàm khởi tạo (Constructor)
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Các phương thức Getter và Setter
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Ghi đè phương thức toString theo định dạng: "Person[name=?,address=?]"
    @Override
    public String toString() {
        return "Person[name=" + name + ",address=" + address + "]";
    }
}
