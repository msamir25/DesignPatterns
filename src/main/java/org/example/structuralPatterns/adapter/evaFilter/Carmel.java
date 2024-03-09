package org.example.structuralPatterns.adapter.evaFilter;

import org.example.structuralPatterns.adapter.Image;

public class Carmel {


    public void init(){
        System.out.println("this is init of carmel Filter");
    }

    public void render(Image image){
        System.out.println("Applying Carmel Filter");
    }
}
