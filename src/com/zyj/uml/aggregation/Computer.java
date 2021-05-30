package com.zyj.uml.aggregation;

/**
 * @program: DesignPattern
 * @ClassName Computer
 * @author: YaJun
 * @Date: 2021 - 05 - 27 - 21:23
 * @Description: com.zyj.uml.aggregation
 * @version: 1.0
 */

/**
 * 聚合是指整体与部分的关系，但是类与类之间可以分离
 * @author 才二
 */
public class Computer {

    private Mouse mouse;

    private Monitor monitor;

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
}

class Mouse {

}

class Monitor {

}
