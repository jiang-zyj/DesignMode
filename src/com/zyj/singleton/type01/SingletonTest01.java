package com.zyj.singleton.type01;

/**
 * @program: DesignPattern
 * @ClassName SingletonTest01
 * @author: YaJun
 * @Date: 2021 - 05 - 30 - 20:16
 * @Package: com.zyj.singleton.type01
 * @Description:
 */
public class SingletonTest01 {

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance);
        System.out.println(instance2);
        // true
        System.out.println(instance == instance2);

        System.out.println("-----------");
        System.out.println(instance.hashCode());
        System.out.println(instance.hashCode());
    }

}

// 饿汉式（静态变量）
/**
 * 优缺点说明：
 *      1）优点：这种写法比较简单，就是在类加载的时候就完成实例化，避免了线程同步的问题
 *
 *      2）缺点：在类装载的时候就完成实例化，没有达到 Lazy Loading(懒加载)的效果，如果从始至终都没有使用过
 *      这个实例，那么就会造成内存的浪费。
 *
 *      3）这种方式基于 classloader 机制避免了多线程的同步问题，不过，instance 在类装载时就实例化，在单例模式
 *      中大多数都是调用 getInstance 方法，但是导致类装载的原因有很多，因此不能确定有其他的方式(或者其他的静态方法)
 *      导致类装载。
 *
 *      4）结论：这种单例模式可用，但是可能会造成内存浪费
 */


class Singleton {

    /**
     * 1. 构造器私有化，外部不能 new
     */
    private Singleton() {

    }

    /**
     * 2. 本类内部创建对象实例
     */
    private final static Singleton instance = new Singleton();

    /**
     * 3. 提供一个共有的静态方法
     */
    public static Singleton getInstance() {
        return instance;
    }

}
