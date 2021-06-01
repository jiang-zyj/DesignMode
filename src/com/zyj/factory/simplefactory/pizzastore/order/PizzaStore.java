package com.zyj.factory.simplefactory.pizzastore.order;

/**
 * @program: DesignPattern
 * @ClassName PizzaStore
 * @author: YaJun
 * @Date: 2021 - 05 - 31 - 9:44
 * @Package: com.zyj.factory.simplefactory.pizzastore.order
 * @Description: 相当于一个客户端
 */
public class PizzaStore {

    public static void main(String[] args) {
        // 使用简单工厂模式
        new OrderPizza(new SimpleFactory());
        System.out.println("退出程序");
    }

}
