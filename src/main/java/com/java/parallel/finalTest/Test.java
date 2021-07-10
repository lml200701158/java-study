package com.java.parallel.finalTest;

public class Test {
    final int age = 18;
    final String name;
    final String[] hobby;
    public Test() {
        this.name = "lvmenglou";        // 正确使用
        //this.age = 20;                // 错误使用
        this.hobby = new String[4];     // 正确使用
        this.hobby[0] = "movie";        // 正确使用
        this.hobby[1] = "sing song";    // 正确使用
    }
}
