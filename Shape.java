package model;

public abstract class Shape {
    private int x = 0;
    private int y = 0;


    public int getX() {
        return x;
    }

    public void setX(int newX) {
        x = newX;
    }

    public int getY() {
        return y;
    }

    public void setY(int newY) {
        y = newY;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
}
