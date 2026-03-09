package Task54C60;

// BigDog.java
public class BigDog extends Dog {
    public BigDog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Wooow");
    }

    @Override
    public void greets(Dog another) {
        System.out.println("Woooooow");
    }

    // Nạp chồng thêm phương thức greets cho đối tượng BigDog
    public void greets(BigDog another) {
        System.out.println("Wooooooooooow");
    }
}