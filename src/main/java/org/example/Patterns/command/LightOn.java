package org.example.Patterns.command;

public class LightOn implements Thing{

    Light l;
    public LightOn(Light l){
        this.l = l;
    }
    @Override
    public void execute() {
        l.lightOn();
    }
}
