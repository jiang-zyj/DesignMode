package com.zyj.uml.implementation;

/**
 * @program: DesignPattern
 * @ClassName PersonService
 * @author: YaJun
 * @Date: 2021 - 05 - 27 - 21:10
 * @Description: com.zyj.uml.implementation
 * @version: 1.0
 */
public interface PersonService {

    public void delete(Integer id);

}

class PersonServiceBean implements PersonService {
    @Override
    public void delete(Integer id) {

    }
}
