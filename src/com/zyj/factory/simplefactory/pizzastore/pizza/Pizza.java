package com.zyj.factory.simplefactory.pizzastore.pizza;

/**
 * @program: DesignPattern
 * @ClassName Pizza
 * @author: YaJun
 * @Date: 2021 - 05 - 31 - 9:30
 * @Package: com.zyj.factory.simplefactory.pizza
 * @Description:
 */
public abstract class Pizza {

    /**
     * pizza 名字
     */
    protected String name;

    /**
     * 准备原材料，不同的披萨不一样，因此，做成抽象方法
     */
    public abstract void prepare();

    /**
     * 烘烤
     */
    public void bake() {
        System.out.println(name + " baking;");
    }

    public void cut() {
        System.out.println(name + " cutting;");
    }

    /**
     * 打包
     */
    public void box() {
        System.out.println(name + " boxing;");
    }

    public void setName(String name) {
        this.name = name;
    }

}
