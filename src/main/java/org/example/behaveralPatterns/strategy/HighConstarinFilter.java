package org.example.behaveralPatterns.strategy;

public class HighConstarinFilter implements Filter{
    @Override
    public void apply(String fileName) {
        System.out.println("apply high-Constrain Filter");
    }
}
