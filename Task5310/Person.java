public class Person {
    // 1. Các thuộc tính (Attributes)
    private String name;
    private double height;
    private double weight;
    private String gender;
    private int age;

    // 2. Phương thức khởi tạo không tham số (No-argument Constructor)
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    // 3. Phương thức khởi tạo có tham số (Parameterized Constructor)
    public Person(String name, double height, double weight, String gender, int age) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
        this.age = age;
    }

    // 4. Getter và Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // 5. Phương thức toString để hiển thị thông tin đối tượng
    @Override
    public String toString() {
        return "Person {" +
                "name='" + name + '\'' +
                ", height=" + height + "m" +
                ", weight=" + weight + "kg" +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}