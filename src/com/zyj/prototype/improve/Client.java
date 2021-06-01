package com.zyj.prototype.improve;

/**
 * @program: DesignPattern
 * @ClassName Client
 * @author: YaJun
 * @Date: 2021 - 06 - 01 - 22:52
 * @Package: com.zyj.prototype
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        Sheep sheep = new Sheep(10, "Tom");

        Sheep firend = new Sheep(9, "jack");
        sheep.setFriend(firend);

        Sheep sheep1 = (Sheep) sheep.clone();
        Sheep sheep2 = (Sheep) sheep.clone();
        Sheep sheep3 = (Sheep) sheep.clone();
        Sheep sheep4 = (Sheep) sheep.clone();
        Sheep sheep5 = (Sheep) sheep.clone();


        System.out.println("sheep1：" + sheep1 + "sheep1 friend is :" + sheep1.friend.hashCode());
        System.out.println("sheep2：" + sheep2 + "sheep2 friend is :" + sheep2.friend.hashCode());
        System.out.println("sheep3：" + sheep3 + "sheep3 friend is :" + sheep3.friend.hashCode());
        System.out.println("sheep4：" + sheep4 + "sheep4 friend is :" + sheep4.friend.hashCode());
        System.out.println("sheep5：" + sheep5 + "sheep5 friend is :" + sheep5.friend.hashCode());

    }

}
