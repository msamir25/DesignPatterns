package org.example.creationalPatterns.prototype;

public class ContextMenu {
    public void duplicate(Component component){
        Component newComonent = component.clone();
    }
}
