package com.zyj.factory.simplefactory.pizzastore.pizza;

/**
 * @program: DesignPattern
 * @ClassName GreekPizza
 * @author: YaJun
 * @Date: 2021 - 05 - 31 - 9:35
 * @Package: com.zyj.factory.simplefactory.pizza
 * @Description:
 */
public class GreekPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("给希腊披萨准备原材料");
    }
}
