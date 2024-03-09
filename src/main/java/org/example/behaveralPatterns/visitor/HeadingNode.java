package org.example.behaveralPatterns.visitor;

public class HeadingNode implements HtmlNode{


    @Override
    public void execute(Visitor visitor) {
        visitor.apply(this);
    }
}
