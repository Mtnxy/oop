package it.utils.shape;

import java.util.Scanner;

public class Rectangle implements Shape {
    private double width;
    private double height;

    public void setWidth(double w) {
        this.width = w;
    }

    public void setHeight(double h) {
        this.height = h;
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    @Override
    public void inputParameter() {
        System.out.println("** Please input parameter of your Rectangle **");
        System.out.println("Input width");
        this.width = new Scanner(System.in).nextDouble();
        System.out.println("Input height");
        this.height = new Scanner(System.in).nextDouble();
    }

    @Override
    public double getArea() {
        return width * height;
    }
}