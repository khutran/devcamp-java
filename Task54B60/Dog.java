package Task54B60;

// File: Dog.java
public class Dog extends Mammal {
    public Dog(String name) {
        super(name);
    }

    public void greets() {
        System.out.println("Woof");
    }

    public void greets(Dog another) {
        System.out.println("Woooof");
    }

    @Override
    public String toString() {
        // Định dạng: Dog[Mammal[Animal[name="?"]]]
        return "Dog[" + super.toString() + "]";
    }
}