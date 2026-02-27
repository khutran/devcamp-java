package Task5330;

public class Person {
    private int id;
    private String name;
    private int age;
    private double salary;

    // 1. Constructor không tham số
    public Person() {
    }

    // 2. Constructor 1 tham số (name)
    public Person(String name) {
        this.name = name;
    }

    // 3. Constructor 2 tham số (name, age)
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 4. Constructor đầy đủ tham số
    public Person(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Subtask 4: Ghi đè phương thức toString()
    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
    }

    // Getter cho salary để phục vụ Subtask 6
    public double getSalary() {
        return salary;
    }
}