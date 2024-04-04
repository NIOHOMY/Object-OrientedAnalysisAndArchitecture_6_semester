package org.example.Patterns.command;

public class RemoteControl {
    Thing smth1;
    Thing smth2;
    public void setSmth1(Thing thing){
        this.smth1 = thing;
    }
    public void setSmth2(Thing thing){
        this.smth2 = thing;
    }

    public void execute1(){
        smth1.execute();
    }
    public void execute2(){
        smth2.execute();
    }

}
