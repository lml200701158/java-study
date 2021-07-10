package com.mybatis.controller;

import com.mybatis.dao.UserDao;
import com.mybatis.entity.MyUser;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//@Service
//public class UserController {
//    @Autowired
//    private UserDao userDao;
//
//    public void update(Integer id) {
//        MyUser user = new MyUser();
//        user.setUid(id);
//        user.setUname("张三-testing");
//        user.setUsex("女");
//        userDao.updateUser(user);
//    }
//
//    public MyUser query(Integer id) {
//        MyUser user = userDao.selectUserById(id);
//        return user;
//    }
//
//    @Transactional(rollbackFor = Exception.class)
//    public void testSuccess() throws Exception {
//        Integer id = 1;
//        MyUser user = query(id);
//        System.out.println("原记录:" + user);
//        update(id);
//        throw new Exception("测试事务生效");
//    }
//
//    public void testFail() throws Exception {
//        testSuccess();
//        throw new Exception("测试事务不生效");
//    }
//
//    @Transactional(rollbackFor = Exception.class)
//    public void testMultThread() throws Exception {
//        new Thread(new Runnable() {
//            @SneakyThrows
//            @Override
//            public void run() {
//                testSuccess();
//            }
//        }).start();
//    }
//}



@Controller("userController")
public class UserController {
    @Autowired
    private UserDao userDao;
    public void test() {
        // 查询一个用户
        MyUser auser = userDao.selectUserById(1);
        System.out.println(auser);
        System.out.println("============================");
        // 查询所有用户
        List<MyUser> list = userDao.selectAllUser();
        for (MyUser myUser : list) {
            System.out.println(myUser);
        }
    }
}

//@Controller("userController")
//public class UserController {
//    @Autowired
//    private UserDao userDao;
//
//    public void update(Integer id) {
//        MyUser updatemu = new MyUser();
//        updatemu.setUid(id);
//        updatemu.setUname("张三1");
//        updatemu.setUsex("女");
//        userDao.updateUser(updatemu);
//    }
//
//    public MyUser query(Integer id) {
//        MyUser user = userDao.selectUserById(id);
//        return user;
//    }
//
//    @Transactional(rollbackFor = Exception.class)
//    public void testSuccess() throws Exception {
//        Integer id = 1;
//        MyUser user = query(id);
//        System.out.println("原记录:" + user);
//        update(id);
//        throw new Exception("测试事务生效");
//    }
//
//    public void testFail() throws Exception {
//        testSuccess();
//        throw new Exception("测试事务不生效");
//    }
//
//    public void test() {
//        // 查询一个用户
//        MyUser auser = userDao.selectUserById(1);
//        System.out.println(auser);
//        System.out.println("============================");
//        // 添加一个用户
////        MyUser addmu = new MyUser();
////        addmu.setUid(3);
////        addmu.setUname("陈恒");
////        addmu.setUsex("男");
////        int add = userDao.addUser(addmu);
////        System.out.println("添加了" + add + "条记录");
////        System.out.println("============================");
////        // 修改一个用户
////        MyUser updatemu = new MyUser();
////        updatemu.setUid(1);
////        updatemu.setUname("张三");
////        updatemu.setUsex("女");
////        int up = userDao.updateUser(updatemu);
////        System.out.println("修改了" + up + "条记录");
////        System.out.println("============================");
////        // 删除一个用户
////        int dl = userDao.deleteUser(9);
////        System.out.println("删除了" + dl + "条记录");
////        System.out.println("============================");
//        // 查询所有用户
//        List<MyUser> list = userDao.selectAllUser();
//        for (MyUser myUser : list) {
//            System.out.println(myUser);
//        }
//    }
//}