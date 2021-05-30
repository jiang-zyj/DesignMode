package com.zyj.uml.Composition;

/**
 * @program: DesignPattern
 * @ClassName Computer
 * @author: YaJun
 * @Date: 2021 - 05 - 27 - 21:23
 * @Description: com.zyj.uml.aggregation
 * @version: 1.0
 */

/**
 * 组合是指类与类不能分离，同样也是整体和部分的关系，但是整体与部分不能分离，要么都在，都么都不在
 * 例如下面所示，如果Computer类创建，则Mouse类的对象与Monitor类的对象必定会创建
 * @author 才二
 */
public class Computer {

    private Mouse mouse = new Mouse();

    private Monitor monitor = new Monitor();

}

class Mouse {

}

class Monitor {

}
