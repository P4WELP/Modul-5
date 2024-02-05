package GeometricFigure;

public class Rectangle implements GeometricFigure {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public int calculateArea() {
        return length * width;
    }

    // Getter dla length
    public int getLength() {
        return length;
    }

    // Getter dla width
    public int getWidth() {
        return width;
    }

    public int calculatePerimeter() {
        return 2 * (length + width);
    }
}