package com.lukmannudin.codelabs.duckapp.base;

import com.lukmannudin.codelabs.duckapp.base.flyable.FlyBehavior;
import com.lukmannudin.codelabs.duckapp.base.quackable.QuackBehavior;

public abstract class Duck {
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    abstract public void display();

    public void swim() {
        System.out.println("Swim");
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}

