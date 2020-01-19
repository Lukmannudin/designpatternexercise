package com.lukmannudin.codelabs.duckapp;

import com.lukmannudin.codelabs.duckapp.base.Duck;
import com.lukmannudin.codelabs.duckapp.base.flyable.FlyNoWay;
import com.lukmannudin.codelabs.duckapp.base.quackable.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("New Design Model Duck");
    }

}
