package com.zyj.singleton.type07;

/**
 * @program: DesignPattern
 * @ClassName SingletonTest03
 * @author: YaJun
 * @Date: 2021 - 05 - 30 - 20:41
 * @Package: com.zyj.singleton.type03
 * @Description:
 */
public class SingletonTest07  {

    public static void main(String[] args) {

        System.out.println("静态内部类");
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
 * 静态内部类(线程安全)
 * 静态内部类说明：
 *      当外部类(Singleton类)被装载时，静态内部类不会被装载，只有当调用 getInstance 方法，调用到
 *      静态内部类中的成员属性时，静态内部类才会被装载。因此实现了 Lazy Loading(懒加载)
 *      且 JVM 在类装载时，是线程安全的。因此也解决了线程安全。
 *      结论：在实际开发中，推荐使用这种单例设计模式
 */
class Singleton {

    /**
     * 私有化构造器
     */
    private Singleton() {}

    private static volatile Singleton instance;

    /**
     * 写一个静态内部类，该类中有一个静态属性 Singleton
     */
    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }

    /**
     * 提供一个静态的公有方法,直接返回 SingletonInstance.INSTANCE
     */
    public static synchronized Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }
}

