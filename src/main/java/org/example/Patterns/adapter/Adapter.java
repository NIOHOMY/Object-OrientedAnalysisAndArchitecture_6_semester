package org.example.Patterns.adapter;

import org.example.Patterns.decorator.Command;

public class Adapter implements I1 {
    CC2 a;
    public Adapter(CC2 c){
        a = c;
    }
    @Override
    public void print1(){
        a.print2();
    }
}
