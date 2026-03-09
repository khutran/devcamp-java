package Task54C50;

// MovableCircle.java
public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center; // Thành phần (Composition)

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        // Khởi tạo đối tượng điểm tại tâm
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public String toString() {
        // Định dạng: "(x,y),speed=(x,y),radius=?"
        return center.toString() + ",radius=" + radius;
    }

    @Override
    public void moveUp() {
        center.moveUp(); // Dịch chuyển tâm lên trên
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }
}