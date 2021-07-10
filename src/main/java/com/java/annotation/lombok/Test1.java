package com.java.annotation.lombok;

import lombok.*;

@Setter
@Getter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
public class Test1 {
    private Integer id;
    private String name;
    private Integer age;
    public static void main(String args[]) {
        Test1 test = new Test1();
        Test1 test1 = test;
        Test1 test2 = new Test1();
        System.out.println("test equals test1:" + test.equals(test1));
        System.out.println("test equals test2:" + test.equals(test2));
        System.out.println("hashCode test:" + test.hashCode());
        System.out.println("hashCode test1:" + test1.hashCode());
        System.out.println("hashCode test2:" + test2.hashCode());
    }
}