package com.zyj.principle.ocp.improve;

/**
 * @author 才二
 * @ClassName Ocp
 * @Auther: YaJun
 * @Date: 2021 - 05 - 27 - 16:13
 * @Description: com.zyj.principle.ocp
 * @version: 1.0
 */
public class Ocp {

    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
    }
}


/**
 * 这是一个用于绘图的类
 */
class GraphicEditor {
    /**
     * 接收一个Shape对象，调用执行 draw 方法
     * @param s
     */
    public void drawShape(Shape s) {
        s.draw();
    }
}

/**
 * Shape 类，基类
 */
abstract class Shape {
    int m_type;

    /**
     * 抽象出一个 draw 方法，让子类去实现
     */
    public abstract void draw();
}

class Rectangle extends Shape {
    Rectangle() {
        super.m_type = 1;
    }

    @Override
    public void draw() {
        System.out.println("绘制矩形");
    }
}

class Circle extends Shape {
    Circle() {
        super.m_type = 2;
    }

    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }
}

class Triangle extends Shape {
    Triangle() {
        super.m_type = 3;
    }
    @Override
    public void draw() {
        System.out.println("绘制三角形");
    }
}
