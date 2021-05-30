package com.zyj.singleton;

/**
 * @program: DesignPattern
 * @ClassName Test
 * @author: YaJun
 * @Date: 2021 - 05 - 30 - 23:20
 * @Package: com.zyj.singleton
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        // Runtime 类中就使用到了饿汉式单例模式
        Runtime runtime = Runtime.getRuntime();
    }

}
