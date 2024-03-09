package org.example.behaveralPatterns.observer;

public class Main {
    public static void main(String[] args) {
        var dataSource = new DataSource();

        var sheet1 =new SpreedSheet();
        var sheet2 =new SpreedSheet();
        var chart = new Chart();

        dataSource.addObserever(sheet1);
        dataSource.addObserever(sheet2);
        dataSource.addObserever(chart);

        dataSource.setValue(1);
    }
}
