package org.example.Patterns.iterator;

import java.util.List;

public class MyCollection{
    public MyCollection(List<Object> l){
        it = new Iterator(l);
    }
    Iterator it;

    public Iterator getIt() {
        return it;
    }
}
