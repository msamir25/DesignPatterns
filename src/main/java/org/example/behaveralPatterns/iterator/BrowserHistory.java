package org.example.behaveralPatterns.iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowserHistory {

    List<String> urls = new ArrayList<>();


    public void push(String url){
        urls.add(url);
    }

    public String pop(){
        var index = urls.size() -1;
        var lastUrl = urls.get(index);

        urls.remove(lastUrl);

        return lastUrl;
    }

    public Iterator createIteraror(){
        return new ListIterator(this);
    }
    public class ListIterator implements Iterator{
        private BrowserHistory history;
        private int index;

        public ListIterator(BrowserHistory history){
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return (index < urls.size());
        }

        @Override
        public String current() {
            return urls.get(index);
        }

        @Override
        public void next() {
            index++;
        }
    }
}
