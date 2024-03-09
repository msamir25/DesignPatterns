package org.example.structuralPatterns.adapter;

import org.example.structuralPatterns.adapter.evaFilter.Carmel;

public class CarmelFilter implements Filter{
    private Carmel carmel;

    public CarmelFilter(Carmel carmel) {
        this.carmel = carmel;
    }

    @Override
    public void apply(Image image) {
        carmel.init();
        carmel.render(image);
    }
}
