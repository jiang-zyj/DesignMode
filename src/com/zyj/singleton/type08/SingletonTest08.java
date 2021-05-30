package com.zyj.singleton.type08;

/**
 * @program: DesignPattern
 * @ClassName SingletonTest03
 * @author: YaJun
 * @Date: 2021 - 05 - 30 - 20:41
 * @Package: com.zyj.singleton.type03
 * @Description:
 */
public class SingletonTest08  {

    public static void main(String[] args) {

        Singleton instance = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance == instance2);
        System.out.println("--------------------");
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());

        instance.sayOk();

    }

}


/**
 * 使用枚举，可以实现单例，推荐使用
 * 优缺点说明：
 *      1) 借助 JDK1.5 中添加的枚举来实现单例模式。不仅能够避免多线程同步问题
 *      而且还能防止反序列化重新创建新的对象。
 *      2) 这种方式是 Effective Java作者 Josh Bolch 提倡的方式
 *      3) 结论：推荐使用
 */
enum Singleton {
    INSTANCE;
    public void sayOk() {
        System.out.println("ok");
    }
}

