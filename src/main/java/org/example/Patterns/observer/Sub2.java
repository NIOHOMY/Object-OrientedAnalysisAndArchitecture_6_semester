package org.example.Patterns.observer;

public class Sub2 implements Observable{

    @Override
    public void update(String message) {
        System.out.println(message+" Sub2");
    }
}
