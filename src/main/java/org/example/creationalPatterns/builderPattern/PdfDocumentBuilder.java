package org.example.creationalPatterns.builderPattern;

public class PdfDocumentBuilder implements PresentationBuilder{

    private PdfDocument document = new PdfDocument();
    @Override
    public void addSolide(Slide slide) {
        document.addPage(slide.getText());
    }
}
