package model;

public class Oval extends Circle {
    private int radius2 = 0;

    public int getRadius2() {
        return radius2;
    }

    public void setRadius2(int newRadius2) {
        if (newRadius2 >= 0)
            radius2 = newRadius2;
    }

    @Override
    public double getPerimeter(){
        return Math.PI*(getRadius()+getRadius2());
    }

    @Override
    public double getArea(){
        return Math.PI*getRadius()*getRadius2();
    }
}