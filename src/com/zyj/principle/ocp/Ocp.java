package com.zyj.principle.ocp;

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
    }
}


/**
 * 这是一个用于绘图的类
 */
class GraphicEditor {
    /**
     * 接收一个Shape对象，然后根据类型type来绘制不同的图形
     * @param s
     */
    public void drawShape(Shape s) {
        if (s.m_type == 1) {
            drawRectangle(s);
        }
        else if (s.m_type == 2) {
            drawCircle(s);
        }
    }

    public void drawRectangle(Shape r) {
        System.out.println("矩形");
    }

    public void drawCircle(Shape r) {
        System.out.println("圆形");
    }
}

/**
 * Shape 类，基类
 */
class Shape {
    int m_type;
}

class Rectangle extends Shape {
    Rectangle() {
        super.m_type = 1;
    }
}

class Circle extends Shape {
    Circle() {
        super.m_type = 2;
    }
}
