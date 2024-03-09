package org.example.behaveralPatterns.chainOfResponsebilty;

public class Authentacator extends Handler{
    public Authentacator(Handler next) {
        super(next);
    }

    @Override
    public boolean doHendle(HttpRequest request) {
        var isValid = (request.getUsername() == "mohamed"
                && request.getPassword() == "1234");
        System.out.println("Authenticated ");
        return !isValid;
    }
}
