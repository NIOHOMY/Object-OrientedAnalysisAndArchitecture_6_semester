package org.example.Patterns.template;

public abstract class TemplatePattern {
    abstract void p1();
    abstract void p2();
    public final void print(){
        p1();
        p2();
    }
}

