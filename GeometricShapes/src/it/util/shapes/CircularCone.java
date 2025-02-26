package it.util.shapes;

public class CircularCone implements GeometricShapes{
    private double radius;
    private double height;

    public CircularCone (double r,double h){
        this.radius = r;
        this.height = h;
    }


    @Override
    public double getVolume() {
        return (1/3.0)*Math.PI*radius*radius*height;
    }

    @Override
    public double getTotalSurfaceArea() {
        return Math.sqrt(radius*radius + height*height);
    }
    public double getLateralSurfaceArea(){
        return Math.PI*radius*Math.sqrt(radius*radius + height*height);
    }
    public double getBaseSurfaceArea(){
        return Math.PI*radius*radius;
    }
    public double getSlantHeight(){
        return  getLateralSurfaceArea()+
                getBaseSurfaceArea();
    }

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }

}
