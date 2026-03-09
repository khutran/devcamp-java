package Task54C50;

// MovablePoint.java
public class MovablePoint implements Movable {
    // ~ denotes package access (không để từ khóa public/private)
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        // Định dạng theo yêu cầu sơ đồ: "(x,y),speed=(x,y)"
        return "(" + x + "," + y + "),speed=(" + xSpeed + "," + ySpeed + ")";
    }

    @Override
    public void moveUp() {
        y -= ySpeed; // Trong đồ họa máy tính y giảm là đi lên,
                     // hoặc y += ySpeed tùy theo quy ước hệ tọa độ toán học.
    }

    @Override
    public void moveDown() {
        y += ySpeed;
    }

    @Override
    public void moveLeft() {
        x -= xSpeed;
    }

    @Override
    public void moveRight() {
        x += xSpeed;
    }
}