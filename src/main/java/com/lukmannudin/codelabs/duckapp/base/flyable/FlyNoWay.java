package com.lukmannudin.codelabs.duckapp.base.flyable;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Fly no way");
    }
}
