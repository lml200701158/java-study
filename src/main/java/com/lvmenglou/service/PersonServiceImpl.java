package com.lvmenglou.service;
import com.lvmenglou.dao.PersonDao;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service("personService")
public class PersonServiceImpl implements PersonService {
    @Resource(name = "personDao")
    private PersonDao personDao;
    public PersonDao getPersonDao() {
        return personDao;
    }
    @Override
    public void add() {
        personDao.add();// 调用personDao中的add()方法
        System.out.println("Service层的add()方法执行了...");
    }
}
