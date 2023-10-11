package model;

public class Square extends Shape {
    private int width = 0;

    public void setWidth(int newWidth) {
        if(newWidth >= 0){
            width = newWidth;
        }
    }

    public int getWidth(){
        return width;
    }

    public int getHeigth() {
        return getWidth();
    }

    public void setHeigth(int newHeigth) {
        setWidth(newHeigth);
    }
    @Override
    public double getArea(){
        return getHeigth()*getWidth();
    }
    @Override
    public double getPerimeter(){
        return (2*getWidth())+(2*getHeigth());
    }
}