package com.zyj.principle.demeter.improve;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Demeter01
 * @Auther: YaJun
 * @Date: 2021 - 05 - 27 - 16:38
 * @Description: com.zyj.principle.demeter
 * @version: 1.0
 */

/**
 * 客户端
 * @author 才二
 */
public class Demeter01 {

    public static void main(String[] args) {
        System.out.println("使用迪米特法则的改进");
        SchoolManager schoolManager = new SchoolManager();
        schoolManager.printAllEmployee(new CollegeManager());
    }

}

/**
 * 学校总部员工
 */
class Employee {
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}

/**
 * 学院员工类
 */
class CollegeEmployee {
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}

/**
 * 管理学院员工的管理类
 */
class CollegeManager {
    public List<CollegeEmployee> getAllEmployee() {
        List<CollegeEmployee> list = new ArrayList<CollegeEmployee>();
        for (int i = 0; i < 10; i++) {
            CollegeEmployee emp = new CollegeEmployee();
            emp.setId("学院员工id= " + i);
            list.add(emp);
        }
        return list;
    }
    /**
     * 输出学院员工的信息
     */
    public void printEmployee() {
        List<CollegeEmployee> list1 = getAllEmployee();
        System.out.println("------------分公司员工------------");
        for (CollegeEmployee e : list1) {
            System.out.println(e.getId());
        }
    }
}

/**
 * 学校管理类
 * 分析 SchoolManager 类的直接朋友类有哪些？
 *      有 Employee、CollegeManager
 * CollegeEmployee 不是直接朋友类，而是一个陌生类，这样违背了迪米特法则
 */
class SchoolManager {
    /**
     * 返回学院所有的员工
     * @return
     */
    public List<Employee> getAllEmployee() {
        List<Employee> list = new ArrayList<Employee>();
        // 这里我们增加了 10 个员工到 list 中
        for (int i = 0; i < 5; i++) {
            Employee emp = new Employee();
            emp.setId("学校总部员工id= " + i);
            list.add(emp);
        }
        return list;
    }

    void printAllEmployee(CollegeManager sub) {

        // 分析问题
        // 1. 将输出学院的员工方法，封装到 CollegeManager 类中

        sub.printEmployee();

        List<Employee> list2 = this.getAllEmployee();
        System.out.println("------------学校总部员工------------");
        for (Employee e : list2) {
            System.out.println(e.getId());
        }
    }
}
