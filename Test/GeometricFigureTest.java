import GeometricFigure.Hexagon;
import GeometricFigure.Rectangle;
import GeometricFigure.Square;
import GeometricFigure.Triangle;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class GeometricFigureTest {

    @Test
    public void testRectangleArea() {
        Rectangle rectangle = new Rectangle(5, 10);
        assertEquals(50, rectangle.calculateArea());
    }

    @Test
    public void testTriangleArea() {
        Triangle triangle = new Triangle(4, 6);
        assertEquals(12, triangle.calculateArea());
    }

    @Test
    public void testHexagonArea() {
        Hexagon hexagon = new Hexagon(4);
        assertEquals(24, hexagon.calculateArea()); // Zaokrąglone do najbliższej całkowitej liczby
    }

    @Test
    public void testSquareDiameter() {
        Square square = new Square(4);
        assertEquals(16, square.calculateDiameter());
    }

    // Dodatkowe testy
    @Test
    public void testSquareArea() {
        Square square = new Square(5);
        assertEquals(25, square.calculateArea());
    }

    @Test
    public void testRectangleDimensions() {
        Rectangle rectangle = new Rectangle(3, 8);
        assertEquals(3, rectangle.getLength());
        assertEquals(8, rectangle.getWidth());
    }
}
