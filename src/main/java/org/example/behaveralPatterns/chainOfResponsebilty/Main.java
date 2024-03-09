package org.example.behaveralPatterns.chainOfResponsebilty;

public class Main {
    public static void main(String[] args) {

        //Authenticate -> Logger ->Compressor

        var compressor = new Compressor(null);
        var logger = new Logger(compressor);
        var authenticater = new Authentacator(logger);
        var server = new WebServer(authenticater);
        server.handle(new HttpRequest("mohame" , "1234"));
    }
}
