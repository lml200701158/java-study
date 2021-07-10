package com.java.annotation.lombok;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Test6 {
    private Integer id;
    private String name;
    private Integer age;
    public static void main(String args[]) {
        Test6 test = Test6.builder().
                id(1).
                name("楼仔").
                age(18).build();
        System.out.println("toString:" + test.toString());
    }
}
