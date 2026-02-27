package Task5320;

public class p2 {
    public static void main(String[] args) {
        ClassA obj = new ClassA();
        System.out.println("--- Access from Class p2 (Same Package) ---");
        System.out.println(obj.publicVar);
        System.out.println(obj.protectedVar);
        System.out.println(obj.defaultVar);
        // System.out.println(obj.privateVar); // This would cause an error
    }
}