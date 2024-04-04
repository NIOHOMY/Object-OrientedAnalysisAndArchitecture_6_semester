package org.example.Patterns.iterator;

import java.util.List;

interface iterable{
    boolean hasNext();
    Object next();
}
public class Iterator implements iterable {
    List<Object> l;
    int position = 0;
    public Iterator(List<Object> l){
        this.l = l;
    }
    @Override
    public boolean hasNext(){
        return l.size() > position;
    }
    @Override
    public Object next(){

        if(hasNext()){
            ++position;
            return l.get(position-1);
        }
        return -1;
    }

}

