package org.example.behaveralPatterns.chainOfResponsebilty;

public class Logger extends Handler{
    public Logger(Handler next) {
        super(next);
    }

    @Override
    public boolean doHendle(HttpRequest request) {
        System.out.println("Log");
        return false;
    }
}
