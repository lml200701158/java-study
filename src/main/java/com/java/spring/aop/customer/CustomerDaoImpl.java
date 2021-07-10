package com.java.spring.aop.customer;

import com.java.spring.aop.jdk.CustomerDao;
import org.springframework.stereotype.Component;

//@Component("customerDao")
//public class CustomerDaoImpl implements CustomerDao {
//    @Override
//    public void add() {
//        System.out.println("添加客户...");
//    }
//    @Override
//    public void update() {
//        System.out.println("修改客户...");
//    }
//    @Override
//    public void delete() {
//        System.out.println("删除客户...");
//    }
//    @Override
//    public void find() {
//        System.out.println("修改客户...");
//    }
//}

@Component("customerDao")
public class CustomerDaoImpl {
    public void add() throws Exception {
        System.out.println("添加客户...");
        //throw new Exception("抛出异常测试");
    }
    public void update() {
        System.out.println("修改客户...");
    }
    public void delete() {
        System.out.println("删除客户...");
    }
    public void find() {
        System.out.println("修改客户...");
    }
}
