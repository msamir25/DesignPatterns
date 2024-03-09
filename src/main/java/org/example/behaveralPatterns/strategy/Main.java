package org.example.behaveralPatterns.strategy;

public class Main {
    public static void main(String[] args) {
        ImageStorage storage = new ImageStorage();

        storage.store("A" ,new JpegCompressor() , new BWFilter());
    }
}
