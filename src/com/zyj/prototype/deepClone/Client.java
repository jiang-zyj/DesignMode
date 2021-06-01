package com.zyj.prototype.deepClone;

/**
 * @program: DesignPattern
 * @ClassName Client
 * @author: YaJun
 * @Date: 2021 - 06 - 01 - 23:23
 * @Package: com.zyj.prototype.deepClone
 * @Description:
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {

        DeepProtoType d = new DeepProtoType();
        d.name = "张三";
        d.deepCloneableTarget = new DeepCloneableTarget("大牛", "mou~");

        // 方式一 完成深拷贝
//        DeepProtoType d2 = (DeepProtoType) d.clone();
//
//        System.out.println("d.name = " + d.name + " d.deepCloneableTarget = " + d.deepCloneableTarget.hashCode());
//        System.out.println("d2.name = " + d2.name + " d2.deepCloneableTarget = " + d2.deepCloneableTarget.hashCode());


        // 方式二 完成深拷贝
        DeepProtoType d2 = (DeepProtoType) d.deepClone();

        System.out.println("d.name = " + d.name + " d.deepCloneableTarget = " + d.deepCloneableTarget.hashCode());
        System.out.println("d2.name = " + d2.name + " d2.deepCloneableTarget = " + d2.deepCloneableTarget.hashCode());

    }

}
