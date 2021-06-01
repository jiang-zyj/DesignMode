package com.zyj.prototype.deepClone;

import java.io.*;

/**
 * @program: DesignPattern
 * @ClassName DeepProtoType
 * @author: YaJun
 * @Date: 2021 - 06 - 01 - 23:17
 * @Package: com.zyj.prototype.deepClone
 * @Description:
 */
public class DeepProtoType implements Serializable, Cloneable {

    public String name;
    // 引用类型
    public DeepCloneableTarget deepCloneableTarget;

    public DeepProtoType() {
    }

    /**
     * 方式一：重写 clone 方法实现深拷贝
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {

        Object deep = null;
        // 这里完成对基本数据类型（属性）和 String 的克隆
        deep = super.clone();
        // 对引用类型的属性进行单独处理
        DeepProtoType deepProtoType = (DeepProtoType) deep;
        deepProtoType.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();

        return deepProtoType;
    }

    /**
     * 方式二：通过对象的序列化实现深拷贝
     */
    public Object deepClone() {
        DeepProtoType copyObj = null;

        // 创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {
            // 序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            // 反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            copyObj = (DeepProtoType) ois.readObject();

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return copyObj;
    }
}
