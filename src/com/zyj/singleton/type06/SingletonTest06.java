package com.zyj.singleton.type06;

/**
 * @program: DesignPattern
 * @ClassName SingletonTest03
 * @author: YaJun
 * @Date: 2021 - 05 - 30 - 20:41
 * @Package: com.zyj.singleton.type03
 * @Description:
 */
public class SingletonTest06  {

    public static void main(String[] args) {

        System.out.println("双重检查");
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
 * 双重检查(线程安全)
 * 优缺点说明：
 *      1) Double-Check 概念是多线程开发中常使用到的，如代码中所示，我们进行了两次
 *      if (instance == null) 的检查，这样就可以保证线程安全了。
 *      2) 这样，实例化代码只用执行一次，后面再次访问时，判断 if (instance == null),
 *      直接 return 实例化对象，也避免了反复进行方法同步。
 *      3) 线程安全；延迟加载；效率更高
 *      3) 结论：在实际开发中，推荐使用这种单例设计模式
 */
class Singleton {

    /**
     * 私有化构造器
     */
    private Singleton() {}

    private static volatile Singleton instance;

    /**
     * 提供一个静态的公有方法，加入双重检查的代码，解决线程安全问题，同时解决懒汉式的问题
     * 同时保证了效率
     * 即双重检查
     */
    public static synchronized Singleton getInstance() {
        // 第一次判断
        if (instance == null) {
            synchronized (Singleton.class) {
                // 第二次判断
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}

