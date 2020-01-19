package com.lukmannudin.codelabs.duckapp;

import com.lukmannudin.codelabs.duckapp.base.Duck;
import com.lukmannudin.codelabs.duckapp.base.flyable.FlyBehavior;
import com.lukmannudin.codelabs.duckapp.base.quackable.QuackBehavior;

public class RedheadDuck extends Duck implements FlyBehavior, QuackBehavior {
    public void display() {
        System.out.println("Display: ReadHead");
    }

    @Override
    public void fly() {
        System.out.println("Fly");
    }

    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
