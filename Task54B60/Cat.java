package Task54B60;

// File: Cat.java
public class Cat extends Mammal {
    public Cat(String name) {
        super(name);
    }

    public void greets() {
        System.out.println("Meow");
    }

    @Override
    public String toString() {
        // Định dạng: Cat[Mammal[Animal[name="?"]]]
        return "Cat[" + super.toString() + "]";
    }
}