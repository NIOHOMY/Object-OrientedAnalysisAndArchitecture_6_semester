package org.example.Patterns.command;

public class LightOff implements Thing{

    Light l;
    public LightOff(Light l){
        this.l = l;
    }
    @Override
    public void execute() {
        l.lightOff();
    }
}
