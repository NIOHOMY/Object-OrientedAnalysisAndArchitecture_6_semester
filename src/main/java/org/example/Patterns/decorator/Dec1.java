package org.example.Patterns.decorator;

public class Dec1 extends Decorator{
    public Dec1(Command command){
        super(command);
    }
    @Override
    public void print(){
        super.print();
        additionalPrint();
    }
    
    public void additionalPrint(){
        System.out.println("Hello world from Dec1!");
    }
}
