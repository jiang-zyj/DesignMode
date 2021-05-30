package com.zyj.uml.dependence;

/**
 * @program: DesignPattern
 * @ClassName PersonServiceBean
 * @author: YaJun
 * @Date: 2021 - 05 - 27 - 20:45
 * @Description: com.zyj.uml.dependence
 * @version: 1.0
 */
public class PersonServiceBean {

    private PersonDao personDao;

    public void save(Person person){}

    public IDCard getIDCard(Integer personId){
        return null;
    }

    public void modify(){
        Department department = new Department();
    }

}

class PersonDao{}
class IDCard{}
class Person{}
class Department{}
