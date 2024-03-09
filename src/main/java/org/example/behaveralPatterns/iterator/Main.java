package org.example.behaveralPatterns.iterator;

public class Main {

    public static void main(String[] args) {
         var history = new BrowserHistory();

        history.push("a");
        history.push("b");
        history.push("c");
        history.push("d");

        Iterator iterator = history.createIteraror();

        while (iterator.hasNext()){
            var url = iterator.current();
            System.out.println(url);
            iterator.next();
        }
    }
}