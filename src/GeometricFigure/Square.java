package GeometricFigure;

public class Square extends Rectangle {
    public Square(int side) {
        super(side, side);
    }

    // Metoda dodana do obliczania obwodu
    public int calculateDiameter() {
        return 4 * getLength(); // Użycie gettera zamiast dostępu bezpośredniego
    }
}
