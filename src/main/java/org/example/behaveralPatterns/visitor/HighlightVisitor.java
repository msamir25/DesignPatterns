package org.example.behaveralPatterns.visitor;

public class HighlightVisitor implements Visitor{
    @Override
    public void apply(HeadingNode heading) {
        System.out.println("Heading highlight");
    }

    @Override
    public void apply(AnchorNode anchor) {
        System.out.println("Anchor highlight");
    }
}
