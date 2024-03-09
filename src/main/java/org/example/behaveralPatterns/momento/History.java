package org.example.behaveralPatterns.momento;

import java.util.ArrayList;
import java.util.List;

public class History {

    List<EditorState> states = new ArrayList<>();

    public void push(EditorState state){
        states.add(state);
    }

    public EditorState pop(){
        var stateIndex = states.size() - 1;
        var stateItem = states.get(stateIndex);

        states.remove(stateIndex);
        return stateItem;
    }
}
