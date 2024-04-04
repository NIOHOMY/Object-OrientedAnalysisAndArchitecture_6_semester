package org.example.Patterns.decorator;

public abstract class Decorator implements Command {
    Command command;
    public Decorator(Command command){
        this.command = command;
    }

    public void print(){
        command.print();
    }
}

