package org.example;


import org.example.Patterns.abstractFabric.AbstractFabric;
import org.example.Patterns.abstractFabric.AbstractFabric1;
import org.example.Patterns.abstractFabric.AbstractFabric2;
import org.example.Patterns.adapter.Adapter;
import org.example.Patterns.adapter.CC1;
import org.example.Patterns.adapter.CC2;
import org.example.Patterns.adapter.I1;
import org.example.Patterns.command.*;
import org.example.Patterns.decorator.C1;
import org.example.Patterns.decorator.Command;
import org.example.Patterns.decorator.Dec1;
import org.example.Patterns.decorator.Decorator;
import org.example.Patterns.facade.Facade;
import org.example.Patterns.iterator.Iterator;
import org.example.Patterns.iterator.MyCollection;
import org.example.Patterns.observer.Observable;
import org.example.Patterns.observer.Observer;
import org.example.Patterns.observer.Sub1;
import org.example.Patterns.observer.Sub2;
import org.example.Patterns.simpleFabric.SimpleFabric;
import org.example.Patterns.singletone.Singletone;
import org.example.Patterns.strategy.Strategy;
import org.example.Patterns.strategy.Strategy1;
import org.example.Patterns.strategy.Strategy2;
import org.example.Patterns.strategy.StrategyPattern;
import org.example.Patterns.template.T1;
import org.example.Patterns.template.TemplatePattern;

import java.util.List;

public class Main {
    public static void strategyFun(){
        StrategyPattern a = new StrategyPattern();
        Strategy b1 = new Strategy1();
        a.setSomeSt(b1);
        a.print();
        Strategy b2 = new Strategy2();
        a.setSomeSt(b2);
        a.print();
    }
    public static void templateFun(){
        TemplatePattern a = new T1();
        a.print();
    }
    public static void singletoneFun(){
        Singletone a = Singletone.createSingletone();
        a = Singletone.createSingletone();
    }

    public static void iteratorFun(){
        List<Object> myList = List.of(1, 2, 3, 4, 5);
        MyCollection a = new MyCollection(myList);

        System.out.println("1Hello world from iterator!");
        Iterator it = a.getIt();
        while(it.hasNext()){
            System.out.println(it.next().toString() + " ");
        }
    }
    public static void decoratorFun(){
        Command b = new C1();
        Decorator a = new Dec1(b);
        a.print();
    }
    public static void adapterFun(){
        I1 b = new CC1();
        CC2 c = new CC2();
        I1 a = new Adapter(c);

        b.print1();
        a.print1();
    }
    public static void commandFun(){
        Light l = new Light();
        Thing thing1 = new LightOn(l);
        Thing thing2 = new LightOff(l);

        RemoteControl R = new RemoteControl();
        R.setSmth1(thing1);
        R.setSmth2(thing2);

        R.execute1();
        R.execute2();
    }
    public static void simpleFabricFun() {
        SimpleFabric f = new SimpleFabric();
        Object a = f.createObject("A");
        Object b = f.createObject("B");

    }
    public static void abstractFabricFun() {
        AbstractFabric f1 = new AbstractFabric1();
        AbstractFabric f2 = new AbstractFabric2();
        Object a1 = f1.createObjectA();
        Object b1 = f1.createObjectB();
        Object a2 = f2.createObjectA();
        Object b2 = f2.createObjectB();
    }
    public static void facadeFun(){
        Facade f = new Facade();
        f.turnOn();
        f.turnOff();
    }
    public static void observerFun(){
        Observer o = new Observer();
        Observable s1 = new Sub1();
        Observable s2 = new Sub2();

        o.addSub(s1);
        o.addSub(s2);

        o.notifyAll("first update");

        o.deleteSub(s1);
        o.notifyAll("second update");
    }
    public static void main(String[] args) {
        strategyFun();
        templateFun();
        singletoneFun();
        iteratorFun();
        decoratorFun();
        adapterFun();
        commandFun();
        simpleFabricFun();
        abstractFabricFun();
        facadeFun();
        observerFun();
    }


}