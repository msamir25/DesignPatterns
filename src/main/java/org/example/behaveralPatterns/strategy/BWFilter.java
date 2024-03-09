package org.example.behaveralPatterns.strategy;

public class BWFilter implements Filter{
    @Override
    public void apply(String fileName) {
        System.out.println("apply B&W Filter");
    }
}
