package org.example.structuralPatterns.adapter;

public class VividaFilter implements Filter{
    @Override
    public void apply(Image image) {
        System.out.println("applying Vivide Filter . ");
    }
}
