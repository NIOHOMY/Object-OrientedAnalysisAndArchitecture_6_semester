package org.example.Patterns.facade;


import org.example.Patterns.command.Light;



public class Facade {
    Light l;
    TV tv;
    public Facade(){
        l = new Light();
        tv = new TV();
    }
    public void turnOn(){
        l.lightOn();
        tv.On();
    }
    public void turnOff(){
        l.lightOff();
        tv.Off();
    }
    class TV{
        public void On() {
            System.out.println("TVOn!");
        }
        public void Off() {
            System.out.println("TVOff!");
        }
    }
}
