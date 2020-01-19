package com.lukmannudin.codelabs.duckapp;

import com.lukmannudin.codelabs.duckapp.base.Duck;
import com.lukmannudin.codelabs.duckapp.base.quackable.QuackBehavior;

public class RubberDuck extends Duck implements QuackBehavior {

    @Override
    public void display() {
        System.out.println("Display: Rubber Duck");
    }

    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
