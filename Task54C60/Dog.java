package Task54C60;

// Dog.java
public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Woof");
    }

    // Nạp chồng phương thức (Overloading)
    public void greets(Dog another) {
        System.out.println("Woooof");
    }
}