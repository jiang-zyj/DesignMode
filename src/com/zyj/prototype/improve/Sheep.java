package com.zyj.prototype.improve;

/**
 * @program: DesignPattern
 * @ClassName Sheep
 * @author: YaJun
 * @Date: 2021 - 06 - 01 - 22:52
 * @Package: com.zyj.prototype
 * @Description:
 */
public class Sheep implements Cloneable {

    private Integer id;
    private String name;
    // 复杂数据类型
    public Sheep friend;

    public Sheep getFriend() {
        return friend;
    }

    public void setFriend(Sheep friend) {
        this.friend = friend;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sheep(Integer id, String name) {
        this.id = id;
        this.name = name;
    }


    @Override
    public String toString() {
        return "Sheep{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", friend=" + friend +
                '}';
    }

    @Override
    protected Object clone() {
        try {
            Sheep sheep = null;
            sheep = (Sheep) super.clone();
            return sheep;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
