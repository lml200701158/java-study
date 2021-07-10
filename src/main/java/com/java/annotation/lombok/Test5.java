package com.java.annotation.lombok;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Test5 {
    private Integer id;
    private final String name = "楼仔";
    private Integer age;

    public static void main(String args[]) {
        Test5 test = new Test5(1,18);
        System.out.println("toString:" + test.toString());
    }
}
