package creational.factory;
/**
 * Concrete Product
 */
public abstract class ShapeFactory {
    @SuppressWarnings("incomplete-switch")
	public static GeometricShape getShape(ShapeType name) {
        GeometricShape shape = null;
        switch (name) {
            case LINE:
                shape = new Line();
                break;
            case CIRCLE:
                shape = new Circle();
                break;
            case RECTANGLE:
                shape = new Rectangle();
                break;
        }
        return shape;
    }
}