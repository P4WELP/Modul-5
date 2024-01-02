package GeometricFigure;

public class Hexagon implements GeometricFigure {
    private int side;

    public Hexagon(int side) {
        this.side = side;
    }

    @Override
    public int calculateArea() {
        return (3 * (int) Math.sqrt(3) * side * side) / 2;
    }
}