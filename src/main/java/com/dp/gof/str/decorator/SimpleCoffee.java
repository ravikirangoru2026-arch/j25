package com.dp.gof.str.decorator;

public class SimpleCoffee implements Coffee{
    @Override
    public String description() {
        return "Simple Coffee";
    }

    @Override
    public double cost() {
        return 5;
    }
}
