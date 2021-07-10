package com.java.annotation.lombok;
import lombok.Data;

@Data
public class Test2 {
    private Integer id;
    private String name;
    private Integer age;
    public static void main(String args[]) {
        Test2 test = new Test2();
        test.setId(1);
        test.setAge(18);
        test.setName("楼仔");
        System.out.println("id:" + test.getId());
        System.out.println("name:" + test.getName());
        System.out.println("age:" + test.getAge());
        System.out.println("toString:" + test.toString());

        Test2 test1 = test;
        Test2 test2 = new Test2();
        System.out.println("test equals test1:" + test.equals(test1));
        System.out.println("test equals test2:" + test.equals(test2));
        System.out.println("hashCode test:" + test.hashCode());
        System.out.println("hashCode test1:" + test1.hashCode());
        System.out.println("hashCode test2:" + test2.hashCode());
    }
}