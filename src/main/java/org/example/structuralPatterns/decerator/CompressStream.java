package org.example.structuralPatterns.decerator;

public class CompressStream implements Stream{
    private Stream stream;

    public CompressStream(Stream stream) {
        this.stream = stream;
    }
    @Override
    public void write(String data){
        var compressed = data.substring(0,5);
        stream.write(compressed);
    }
}
