package com.zyj.factory.simplefactory.pizzastore.order;

import com.zyj.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.zyj.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.zyj.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @program: DesignPattern
 * @ClassName OrderPizza
 * @author: YaJun
 * @Date: 2021 - 05 - 31 - 9:36
 * @Package: com.zyj.factory.simplefactory.pizzastore.order
 * @Description:
 */
public class OrderPizza {

    /**
     * 构造器
     */
//    public OrderPizza() {
//        Pizza pizza = null;
//        // 订购披萨的类型
//        String orderType;
//        while (true) {
//            orderType = getType();
//            if ("greedPizza".equals(orderType)) {
//                pizza = new GreekPizza();
//                pizza.setName("greedPizza");
//            } else if ("cheesePizza".equals(orderType)) {
//                pizza = new CheesePizza();
//                pizza.setName("cheesePizza");
//            } else {
//                break;
//            }
//            // 输出 pizza 制作全过程
//            pizza.prepare();
//            pizza.bake();
//            pizza.cut();
//            pizza.box();
//        }
//    }


    /**
     * 定义一个简单工厂对象
     */
    SimpleFactory simpleFactory = null;
    Pizza pizza = null;

    /**
     * 构造器
     */
    public OrderPizza(SimpleFactory simpleFactory) {
        setFactory(simpleFactory);
    }

    public void setFactory(SimpleFactory simpleFactory) {
        // 用户输入
        String orderType = "";

        this.simpleFactory = simpleFactory;

        while (true) {
            orderType = getType();
            pizza = this.simpleFactory.createPizza(orderType);

            // 输出 pizza
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购披萨失败");
                break;
            }
        }
    }

    private String getType() {
        try {
            BufferedReader string = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");
            String str = string.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

}
