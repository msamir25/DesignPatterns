package org.example.structuralPatterns.composite;

public class Main {
    public static void main(String[] args) {
        var shape1= new Shape();
        var shape2 = new Shape();

        var group1 = new Group();
        group1.add(shape1);
        group1.add(shape2);

        group1.render();

    }
}
