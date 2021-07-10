package com.java.annotation.lombok;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@ToString
public class Test3 {
    private String name;
    private Integer age;

    public static void main(String args[]) {
        Test3 test = new Test3();
        System.out.println("toString:" + test.toString());
    }
}

