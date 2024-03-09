package org.example.behaveralPatterns.strategy;

public class JpegCompressor implements Compressor{
    @Override
    public void compress(String fileName) {
        System.out.println("Comprssed by JPEG compressor");
    }
}
