package it.util.shapes;

public class CircularCylinder implements GeometricShapes{

    private double radius;
    private double height;

    public CircularCylinder(double r,double h){
        this.radius = r;
        this.height = h;
    }

    @Override
    public double getVolume() {
        //double v =Math.PI*radius*radius*height;

        return Math.PI*radius*radius*height;
    }

    @Override
    public double getTotalSurfaceArea() {
        return getLateralSurfaceArea()+
                getTopSurfaceArea()+
                getBottomSurfaceArea();
    }
    public double getLateralSurfaceArea(){
        return 2*Math.PI*radius*height;
    }
    public double getTopSurfaceArea(){
        return Math.PI*radius*radius;
    }
    public double getBottomSurfaceArea(){
        return Math.PI*radius*radius;
    }
    public double getRadius(){
        return radius;
    }
    public double getHeight(){
        return height;
    }

}
