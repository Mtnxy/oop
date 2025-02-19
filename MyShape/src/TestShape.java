import it.utils.shape.*;

public class TestShape {
    public static void main(String[] args) {
        System.out.println();
        Circle circle = new Circle();
        circle.inputParameter();
        System.out.println("Circle radius: " + circle.getRadius());
        System.out.println("Circle area: " +circle.getArea());
        System.out.println("Circle circumference: "+ circle.getCircumference());

        Triangle triangle = new Triangle();
        System.out.println();
        triangle.inputParameter();
        System.out.println("Triangle base: "+ triangle.getBase()+" height: "+ triangle.getHeight());
        System.out.println("Triangle area: "+ triangle.getArea());
    
        Rectangle rectangle = new Rectangle();
        System.out.println();
        rectangle.inputParameter();
        System.out.println("Rectangle width: "+ rectangle.getWidth()+" height: "+rectangle.getHeight());
        System.out.println("Rectangle area: "+ rectangle.getArea());
    }
}
