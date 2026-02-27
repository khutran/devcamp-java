package Task5320;

class ClassA {
    public String publicVar = "Public: Truy cập mọi nơi";
    protected String protectedVar = "Protected: Trong package & lớp con";
    String defaultVar = "Default: Chỉ trong package";
    private String privateVar = "Private: Chỉ trong Class A";

    public void display() {
        // Trong chính nó: Truy cập được tất cả
        System.out.println(publicVar);
        System.out.println(protectedVar);
        System.out.println(defaultVar);
        System.out.println(privateVar);
    }
}

public class p1 {
    public static void main(String[] args) {
        ClassA obj = new ClassA();
        System.out.println("--- Access from Class B (Same Package) ---");
        System.out.println(obj.publicVar); // OK
        System.out.println(obj.protectedVar); // OK
        System.out.println(obj.defaultVar); // OK
        // System.out.println(obj.privateVar); // LỖI: Private không thể truy cập từ bên
        // ngoài
    }
}