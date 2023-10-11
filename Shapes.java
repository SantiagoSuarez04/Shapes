package model;

import java.util.ArrayList;

public class Shapes {

    int suma=0;

    private ArrayList<Shape> shapesList = new ArrayList<>();

    public void addShape(Shape s){
        shapesList.add(s);
    }

    public Shape getShape(int index){
         return shapesList.get(index);
    }

    public double getArea(){
        for(Shape shape: shapesList){
            suma+=shape.getArea();
        }
        return suma;
    }
}