package org.example.behaveralPatterns.visitor;

public class Main {
    public static void main(String[] args) {
        var document = new HtmlDocument();
        document.add(new AnchorNode());
        document.add(new HeadingNode());

        document.execute(new HighlightVisitor());
    }
}
