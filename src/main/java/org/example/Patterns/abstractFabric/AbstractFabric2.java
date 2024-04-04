package org.example.Patterns.abstractFabric;

import org.example.Patterns.simpleFabric.Object;

public class AbstractFabric2 implements AbstractFabric{

    public Object createObjectA(){return new ObjectA2();}
    public Object createObjectB(){return new ObjectB2();}
}
