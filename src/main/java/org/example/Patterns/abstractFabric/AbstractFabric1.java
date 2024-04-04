package org.example.Patterns.abstractFabric;

import org.example.Patterns.simpleFabric.Object;

public class AbstractFabric1 implements AbstractFabric{

    public Object createObjectA(){return new ObjectA1();}
    public Object createObjectB(){return new ObjectB1();}
}
