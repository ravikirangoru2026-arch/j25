package com.dp.gof.str.decorator.dec;

import com.dp.gof.str.decorator.Coffee;

public class SugarDecorator extends CoffeeDecorator{
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double cost() {
        return super.cost() + 1.0;
    }

    @Override
    public String description() {
        return super.description() +", Sugar";
    }
}
