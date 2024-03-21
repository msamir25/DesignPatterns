package org.example.creationalPatterns.builderPattern;

public class MovieDocumentBuilder implements PresentationBuilder{
    private Movie movie = new Movie();
    @Override
    public void addSolide(Slide slide) {
        movie.addFrame(slide.getText() , 3);
    }
}
