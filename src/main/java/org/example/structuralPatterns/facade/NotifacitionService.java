package org.example.structuralPatterns.facade;

public class NotifacitionService {
    public void send(String message , String target){
        var server = new NotificationServer();
        var connection = server.connect("IP");
        var authToken = server.authenticate("ipAddress" , "key");
        server.send(authToken , new Message(message), "target");
        connection.disconnect();
    }
}
