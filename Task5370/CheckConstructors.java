package Task5370;

import java.lang.reflect.Constructor;

public class CheckConstructors {
    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("Task5370.Order2");
            System.out.println("Class: " + clazz.getName());
            Constructor<?>[] constructors = clazz.getDeclaredConstructors();
            for (Constructor<?> c : constructors) {
                System.out.println("Constructor: " + c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
