package com.lvmenglou.dao;
import lombok.Data;
import org.springframework.stereotype.Repository;

@Repository("personDao")
@Data
public class PersonDaoImpl implements PersonDao {
    private String name;
    @Override
    public void add() {
        System.out.println("Dao层的add()方法执行了...");
    }
}