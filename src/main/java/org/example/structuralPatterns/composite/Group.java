package org.example.structuralPatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Group implements Components{

    List<Components> components = new ArrayList<>();
     public void add(Components shape){
         components.add(shape);
     }

     public void render(){
         for (var shape: components){
             shape.render();
         }
     }


}
