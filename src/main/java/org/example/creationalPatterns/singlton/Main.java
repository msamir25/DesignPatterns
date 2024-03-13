package org.example.creationalPatterns.singlton;

public class Main {
    public static void main(String[] args) {
        ConfigManger configManger = ConfigManger.getInstance();
        configManger.set("name" , "mohamed");

        ConfigManger other = ConfigManger.getInstance();
        System.out.println(other.get("name"));
    }
}
