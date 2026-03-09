package Task54C20;

// MovablePoint.java
public class MovablePoint implements Movable {
    // Thuộc tính private theo sơ đồ (-x, -y)
    private int x;
    private int y;

    // Constructor có tham số
    public MovablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Ghi đè phương thức toString()
    @Override
    public String toString() {
        return "MovablePoint(x=" + x + ", y=" + y + ")";
    }

    // Triển khai thực tế các phương thức từ Interface (Provide actual
    // implementation)
    @Override
    public void moveUp() {
        y++; // Di chuyển lên trên (tăng y)
    }

    @Override
    public void moveDown() {
        y--; // Di chuyển xuống dưới (giảm y)
    }

    @Override
    public void moveLeft() {
        x--; // Di chuyển sang trái (giảm x)
    }

    @Override
    public void moveRight() {
        x++; // Di chuyển sang phải (tăng x)
    }
}