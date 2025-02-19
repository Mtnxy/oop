package it.utils.shape;

import java.util.Scanner;

public class Circle implements Shape {
    private double radius;

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double r){
        this.radius = r;
    }
    public double getCircumference(){
        return 2*Math.PI*radius;
    }
    @Override
    public void inputParameter() {
        System.out.println("** Please input parameter of your Circle ** ");
        System.out.println("Please input radius : ");
        this.radius = new Scanner(System.in).nextDouble();
    }

    @Override
    public double getArea() {
        return Math.PI*radius;
    }
}
