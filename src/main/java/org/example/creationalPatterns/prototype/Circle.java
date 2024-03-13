package org.example.creationalPatterns.prototype;

public class Circle implements Component{

    private int reduis;
    public int getReduis() {
        return reduis;
    }

    public void setReduis(int reduis) {
        this.reduis = reduis;
    }

    @Override
    public void render() {

    }

    @Override
    public Component clone() {
            Circle target = new Circle();
            target.setReduis(reduis);
            return target;
    }

}
