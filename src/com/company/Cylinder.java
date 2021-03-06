package com.company;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        super();
        this.height = 1.0;
    }

    public Cylinder(double radius) {
        super(radius);
        this.height = 1.0;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return super.getArea() * height;
    }

    @Override
    public double getArea() {
        return (2*Math.PI*getRadius()*this.height + 2*super.getArea());
    }

    public double getBaseArea() {
        return super.getArea();
    }

    @Override
    public String toString() {
        return "Cylinder: subclass of " + super.toString() + " height="
                + this.height;
    }
}