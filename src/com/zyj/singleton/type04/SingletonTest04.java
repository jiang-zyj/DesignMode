package com.zyj.singleton.type04;

/**
 * @program: DesignPattern
 * @ClassName SingletonTest03
 * @author: YaJun
 * @Date: 2021 - 05 - 30 - 20:41
 * @Package: com.zyj.singleton.type03
 * @Description:
 */
public class SingletonTest04 {

    public static void main(String[] args) {

        System.out.println("懒汉式02，线程安全");
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        // true
        System.out.println(instance == instance2);

        System.out.println("-----------");
        System.out.println(instance.hashCode());
        System.out.println(instance.hashCode());

    }

}


/**
 * 懒汉式(线程安全)
 * 优缺点说明：
 *      1) 解决了线程不安全的问题
 *      2) 效率太低，每个线程在想获得类的实例的时候，执行 getInstance() 方法
 *      都要进行同步。而其实这个方法只执行一次实例化代码就够了，后面的想获得该
 *      类实例，直接 return 就行了。方法进行同步效率太低了。
 *      3) 结论：在实际开发中，不推荐使用这种方式，效率太低。
 */
class Singleton {

    /**
     * 私有化构造器
     */
    private Singleton() {}

    private static Singleton singleton;

    /**
     * 提供一个静态的公有方法，加入同步处理的代码，解决线程不安全的问题
     * 即懒汉式
     */
    public static synchronized Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}

