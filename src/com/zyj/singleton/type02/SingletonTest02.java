package com.zyj.singleton.type02;

/**
 * @program: DesignPattern
 * @ClassName SingletonTest01
 * @author: YaJun
 * @Date: 2021 - 05 - 30 - 20:16
 * @Package: com.zyj.singleton.type01
 * @Description:
 */
public class SingletonTest02 {

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

// 饿汉式（静态代码块）

/**
 * 优缺点说明：
 *      1）这种方式和静态变量相类似，只不过将类实例化的过程放在了静态代码块中，
 *      也就是在类装载的时候，就执行静态代码块中的代码，初始化类的实例。优缺点和
 *      饿汉式(静态变量)是一样的。
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
    private static Singleton instance;

    // 在静态代码块执行时，创建单例对象
    static {
        instance = new Singleton();
    }
    /**
     * 3. 提供一个共有的静态方法
     */
    public static Singleton getInstance() {
        return instance;
    }

}
