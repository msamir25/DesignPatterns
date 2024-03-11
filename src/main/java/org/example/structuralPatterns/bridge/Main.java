package org.example.structuralPatterns.bridge;

public class Main {
    public static void main(String[] args) {
        var remoteControl = new RemoteControl(new SonyTv());
        remoteControl.turnOn();
    }
}
