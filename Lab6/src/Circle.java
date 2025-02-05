public class Circle extends Shape{
    private double radius;
    public Circle(double radius) {

        super("Circle");
        this.radius = radius;

    }

    @Override
    public void draw() {

        System.out.println("Drawing a Circle with radius: " + radius);

    }

    @Override
    public double area() {

        return Math.PI * radius * radius;

    }
}
