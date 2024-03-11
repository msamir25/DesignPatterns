package org.example.structuralPatterns.flyweight;


import java.util.ArrayList;
import java.util.List;

public class PointService {

    private PointIconFactory iconFactory;

    public PointService(PointIconFactory iconFactory) {
        this.iconFactory = iconFactory;
    }

    public List<Points>getPoints(){
        List<Points> points = new ArrayList<>();
        Points point = new Points(1,2,iconFactory.getPointIcon(PointType.HOUSE));
        points.add(point);
        return points;
    }
}
