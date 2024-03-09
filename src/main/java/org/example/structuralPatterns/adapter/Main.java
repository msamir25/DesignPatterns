package org.example.structuralPatterns.adapter;

import org.example.structuralPatterns.adapter.evaFilter.Carmel;

public class Main {
    public static void main(String[] args) {
        var imageView = new ImageView(new Image());
        var carmelFilter = new CarmelFilter(new Carmel());
        imageView.apply(carmelFilter);
    }
}
