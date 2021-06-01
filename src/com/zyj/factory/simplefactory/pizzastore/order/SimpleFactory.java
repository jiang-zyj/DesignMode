package com.zyj.factory.simplefactory.pizzastore.order;

import com.zyj.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.zyj.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.zyj.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @program: DesignPattern
 * @ClassName SimpleFactory
 * @author: YaJun
 * @Date: 2021 - 05 - 31 - 9:55
 * @Package: com.zyj.factory.simplefactory.pizzastore.order
 * @Description: 简单工厂类
 */
public class SimpleFactory {

    public Pizza createPizza(String orderType) {

        Pizza pizza = null;

        if ("greed".equals(orderType)) {
            pizza = new GreekPizza();
            pizza.setName("greedPizza");
        } else if ("cheese".equals(orderType)) {
            pizza = new CheesePizza();
            pizza.setName("cheesePizza");
        }
        return pizza;
    }
}
