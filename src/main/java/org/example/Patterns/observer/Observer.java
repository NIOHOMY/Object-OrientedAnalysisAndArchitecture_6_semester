package org.example.Patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Observer {
    List<Observable> l;
    public Observer(){
        l = new ArrayList<>();
    }
    public void addSub(Observable sub){
        l.add(sub);
    }
    public void deleteSub(Observable sub) {
        if (l.contains(sub)) {
            l.remove(sub);
        }
    }
    public void notifyAll(String message){
        for(Observable i:  l)
        {
            i.update(message);
        }
    }

}
