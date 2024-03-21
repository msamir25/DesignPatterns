package org.example.creationalPatterns.builderPattern;

import java.util.ArrayList;
import java.util.List;

public class Presentation {
    private List<Slide>slides = new ArrayList<>();

    public void addSlide(Slide slide){
        slides.add(slide);
    }

    public void expert(PresentationBuilder builder){
        builder.addSolide(new Slide("CopyWrite"));

    }
}
