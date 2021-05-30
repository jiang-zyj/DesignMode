package com.zyj.uml.generalization;

/**
 * @program: DesignPattern
 * @ClassName DaoSupport
 * @author: YaJun
 * @Date: 2021 - 05 - 27 - 20:58
 * @Description: com.zyj.uml.dependence.generalization
 * @version: 1.0
 */
public class DaoSupport {

    public void save(Object entity){
    }
    public void delete(Object id){
    }

}

class PersonServiceBean extends DaoSupport {

}
