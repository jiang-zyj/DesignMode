package com.zyj.singleton.type03;

/**
 * @program: DesignPattern
 * @ClassName SingletonTest03
 * @author: YaJun
 * @Date: 2021 - 05 - 30 - 20:41
 * @Package: com.zyj.singleton.type03
 * @Description:
 */
public class SingletonTest03 {

    public static void main(String[] args) {

        System.out.println("懒汉式01，线程不安全");
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
 * 懒汉式(线程不安全)
 * 优缺点说明：
 *      1) 起到了 Lazy Loading(懒加载)的作用，但是只能在单线程下使用
 *      2) 如果在多线程下，一个线程进入了 if(singleton == null)语句块，但还
 *      未来得及往下执行，另一个线程也通过了这个判断语句，这时便会产生多个实例。
 *      所以，在多线程环境下不可使用这种方式
 *      3) 结论：在实际开发中，不要使用这种方式，有潜在的风险。
 */
class Singleton {

    /**
     * 私有化构造器
     */
    private Singleton() {}

    private static Singleton singleton;

    /**
     * 提供一个静态的公有方法，当使用到该方法时，才去创建单例对象
     * 即懒汉式
     */
    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}

