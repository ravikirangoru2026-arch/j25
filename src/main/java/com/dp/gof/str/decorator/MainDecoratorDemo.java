package com.dp.gof.str.decorator;

import com.dp.gof.str.decorator.dec.MilkDecorator;
import com.dp.gof.str.decorator.dec.SugarDecorator;

public class MainDecoratorDemo {
    static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println( coffee.description() + " Rs : "+coffee.cost());

        coffee= new MilkDecorator(coffee);
        coffee= new SugarDecorator(coffee);
        System.out.println( coffee.description() + " Rs : "+coffee.cost());

    }
}
