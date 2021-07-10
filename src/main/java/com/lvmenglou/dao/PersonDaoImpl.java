package com.lvmenglou.dao;
import org.springframework.stereotype.Repository;

@Repository("personDao")
public class PersonDaoImpl implements PersonDao {
    @Override
    public void add() {
        System.out.println("Dao层的add()方法执行了...");
    }
}