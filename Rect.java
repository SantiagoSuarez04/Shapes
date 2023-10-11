package model;

public class Rect extends Square {
    private int heigth = 0;

    @Override
    public void setHeigth(int newHeigth) {
        if (newHeigth >= 0)
            heigth = newHeigth;
    }

    @Override
    public int getHeigth() {
        return heigth;
    }
}
