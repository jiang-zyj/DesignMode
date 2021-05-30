package com.zyj.singleton.type05;

/**
 * @program: DesignPattern
 * @ClassName SingletonTest03
 * @author: YaJun
 * @Date: 2021 - 05 - 30 - 20:41
 * @Package: com.zyj.singleton.type03
 * @Description:
 */
public class SingletonTest05 {

    public static void main(String[] args) {

        System.out.println("懒汉式03，线程不安全");
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
 * 懒汉式(线程不安全)(同步代码块)
 * 优缺点说明：
 *      虽然加了同步关键字，但同样是线程不安全的，因为可能有几个线程同时进入if(singleton == nul)的判断，
 *      然后再同步创建出多个实例出来。
 *      同步代码块并不能解决线程安全问题，与第一种懒汉式类似
 *      结论：在实际开发中，不推荐使用这种方式。
 */
class Singleton {

    /**
     * 私有化构造器
     */
    private Singleton() {
    }

    private static Singleton singleton;

    /**
     * 提供一个静态的公有方法，加入同步处理的代码块
     * 即懒汉式
     */
    public static Singleton getInstance() {
        synchronized (Singleton.class) {
            if (singleton == null) {
                singleton = new Singleton();
            }
        }
        return singleton;
    }
}

