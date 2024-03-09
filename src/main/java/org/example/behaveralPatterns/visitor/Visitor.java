package org.example.behaveralPatterns.visitor;

public interface Visitor {
    void apply(HeadingNode heading);
    void apply(AnchorNode anchor);
}
