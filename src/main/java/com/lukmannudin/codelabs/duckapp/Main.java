package com.lukmannudin.codelabs.duckapp;

import com.lukmannudin.codelabs.duckapp.base.Duck;

public class Main {
    public static void main(String[] args) {
        Duck rd = new MallardDuck();
        rd.display();
        rd.performQuack();
        rd.performFly();
    }
}
