package org.example.Patterns.strategy;

public class StrategyPattern {
    Strategy someSt;

    public void print(){
        someSt.print();
    }

    public void setSomeSt(Strategy someSt) {
        this.someSt = someSt;
    }
}

