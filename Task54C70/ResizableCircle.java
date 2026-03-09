package Task54C70;

// ResizableCircle.java
public class ResizableCircle extends Circle implements Resizable {

    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public String toString() {
        // Định dạng: ResizableCircle[Circle[radius=?]]
        return "ResizableCircle[" + super.toString() + "]";
    }

    @Override
    public void resize(int percent) {
        // Công thức: radius *= percent / 100.0
        this.radius *= percent / 100.0;
    }
}