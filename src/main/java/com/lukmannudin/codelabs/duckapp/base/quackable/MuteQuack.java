package com.lukmannudin.codelabs.duckapp.base.quackable;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println(".........");
    }
}
