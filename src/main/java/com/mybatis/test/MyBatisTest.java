package com.mybatis.test;

import com.mybatis.entity.MyUser;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

// 仅用于测试MyBatis，不和Spring关联
public class MyBatisTest {
    public static void main(String[] args) {
        try {
            // 读取配置文件 mybatis-config.xml
            InputStream config = Resources.getResourceAsStream("com/mybatis/config/datasources/mybatis-config.xml");
            // 根据配置文件构建SqlSessionFactory
            SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(config);
            // 通过 SqlSessionFactory 创建 SqlSession
            SqlSession ss = ssf.openSession();

            // 查询一个用户
            MyUser mu = ss.selectOne("com.mybatis.dao.UserDao.selectUserById", 1);
            System.out.println(mu);

            // 修改一个用户
            MyUser updatemu = new MyUser();
            updatemu.setUid(1);
            updatemu.setUname("张三");
            updatemu.setUsex("女");
            ss.update("com.mybatis.dao.UserDao.updateUser", updatemu);

//            // 添加一个用户
//            MyUser addmu = new MyUser();
//            addmu.setUid(3);
//            addmu.setUname("德永");
//            addmu.setUsex("男");
//            ss.insert("com.mybatis.dao.UserDao.addUser", addmu);
//
//            addmu.setUid(4);
//            addmu.setUname("曹栋");
//            addmu.setUsex("男");
//            ss.insert("com.mybatis.dao.UserDao.addUser", addmu);
//
//            // 删除一个用户
//            ss.delete("com.mybatis.dao.UserDao.deleteUser", 3);

            // 查询所有用户
            List<MyUser> listMu = ss.selectList("com.mybatis.dao.UserDao.selectAllUser");
            for (MyUser myUser : listMu) {
                System.out.println(myUser);
            }
            // 提交事务
            ss.commit();
            // 关闭 SqlSession
            ss.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
