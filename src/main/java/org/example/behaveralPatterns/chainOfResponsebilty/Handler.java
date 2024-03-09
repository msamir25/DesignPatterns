package org.example.behaveralPatterns.chainOfResponsebilty;

public abstract class Handler {

    private Handler next;

    public Handler(Handler next) {
        this.next = next;
    }

    public void hendle(HttpRequest request){
        if (doHendle(request)){
            return;
        }
        if (next != null){
            next.hendle(request);
        }
    }
    public abstract boolean doHendle(HttpRequest request);
}
