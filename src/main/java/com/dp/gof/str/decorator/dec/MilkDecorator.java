package com.dp.gof.str.decorator.dec;

import com.dp.gof.str.decorator.Coffee;

public class MilkDecorator extends CoffeeDecorator{
    @Override
    public double cost() {
        return super.cost() + 2.0;
    }

    @Override
    public String description() {
        return super.description() + ", Milk";
    }

    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }
}
