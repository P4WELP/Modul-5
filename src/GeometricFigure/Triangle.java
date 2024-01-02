package GeometricFigure;

public class Triangle implements GeometricFigure {
    private int base;
    private int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public int calculateArea() {
        return (base * height) / 2;
    }
}
