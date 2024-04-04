package org.example.Patterns.simpleFabric;

public class SimpleFabric {
    public Object createObject(String type){
        if (type.equals("A")){
            return new ObjectA();
        }
        else{
            return new ObjectB();
        }
    }
}
