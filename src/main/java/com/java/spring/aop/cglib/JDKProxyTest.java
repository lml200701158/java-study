package com.java.spring.aop.cglib;

import org.junit.Test;

public class JDKProxyTest {
    @Test
    public void test() {
        // 从工厂获得指定的内容（相当于spring获得，但此内容时代理对象）
        GoodsDao goodsDao = MyBeanFactory.getBean();
        // 执行方法
        goodsDao.add();
        goodsDao.update();
        // goodsDao.delete();
        // goodsDao.find();
    }
}
