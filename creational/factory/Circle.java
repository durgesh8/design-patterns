package creational.factory;
/**
 * Concrete product
 */
public class Circle implements GeometricShape{
    @Override
    public void draw() {
        System.out.println("Circle is drawn.");
    }
}