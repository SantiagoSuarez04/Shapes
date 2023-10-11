package model;

public class Circle extends Shape {
    private int radius = 0;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int newRadius) {
        if(newRadius >= 0){
            radius = newRadius;
        }
    }
    @Override
    public double getPerimeter(){
        return 2*Math.PI*getRadius();
    }
    @Override
    public double getArea(){
        return Math.PI*getRadius()*getRadius();
    }
}
