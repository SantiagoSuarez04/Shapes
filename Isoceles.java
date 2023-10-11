package model;

public class Isoceles extends Square {

    public double getHypotenuse(){
        return Math.sqrt((getHeigth()*getHeigth())+(getWidth()*getWidth()));
    }

    @Override
    public double getArea() {
        return (getHeigth()*getWidth())/2;
    }

    @Override
    public double getPerimeter() {
        return getHypotenuse()+getWidth()+getHeigth();
    }
}
