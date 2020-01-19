package com.lukmannudin.codelabs.duckapp;

import com.lukmannudin.codelabs.duckapp.base.Duck;
import com.lukmannudin.codelabs.duckapp.base.flyable.FlyWithWings;
import com.lukmannudin.codelabs.duckapp.base.quackable.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("Display: Mallard");
    }

}
