package org.example.behaveralPatterns.chainOfResponsebilty;

public class Compressor extends Handler{
    public Compressor(Handler next) {
        super(next);
    }

    @Override
    public boolean doHendle(HttpRequest request) {
        System.out.println("Compress");
        return false;
    }
}
