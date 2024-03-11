package org.example.structuralPatterns.flyweight;

public class Points {
    private int x;
    private int y;

    private PointIcon icon;
    public Points(int x, int y, PointIcon icon) {
        this.x = x;
        this.y = y;
        this.icon = icon;
    }

    public void drow(){
        System.out.printf("%s at (%d ,%d)" , icon.getType() , x ,y);
    }
}
