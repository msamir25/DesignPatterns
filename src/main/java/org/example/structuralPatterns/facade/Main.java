package org.example.structuralPatterns.facade;

public class Main {
    public static void main(String[] args) {
        var notifation = new NotifacitionService();
        notifation.send("hello there " , "target");
    }
}
