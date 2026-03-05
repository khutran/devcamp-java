package Task54B60;

// File: Mammal.java
public class Mammal extends Animal {
    public Mammal(String name) {
        super(name);
    }

    @Override
    public String toString() {
        // Định dạng theo yêu cầu: Mammal[Animal[name="?"]]
        return "Mammal[" + super.toString() + "]";
    }
}