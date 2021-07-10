package com.java.annotation.lombok;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@ToString
public class Test4 {
    private Integer id;
    private final String name;
    @NonNull
    private Integer age;

    public static void main(String args[]) {
        Test4 test = new Test4("楼仔", 18);
        System.out.println("toString:" + test.toString());
    }
}