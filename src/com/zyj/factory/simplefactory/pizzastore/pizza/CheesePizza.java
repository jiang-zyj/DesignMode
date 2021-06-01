package com.zyj.factory.simplefactory.pizzastore.pizza;

/**
 * @program: DesignPattern
 * @ClassName CheesePizza
 * @author: YaJun
 * @Date: 2021 - 05 - 31 - 9:34
 * @Package: com.zyj.factory.simplefactory.pizza
 * @Description:
 */
public class CheesePizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("给制作奶酪准备原材料");
    }
}
