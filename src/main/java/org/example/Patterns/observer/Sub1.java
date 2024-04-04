package org.example.Patterns.observer;

public class Sub1 implements Observable{

    @Override
    public void update(String message) {
        System.out.println(message+" Sub1");
    }
}
