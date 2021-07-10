package com.pattern.builder.notgood;

public class penguin {
    private String  name;
    private Integer age;
    private String  sex;
    private Integer heignt;

    public penguin(String name) {
        this.name = name;
    }
    public penguin(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    public penguin(String name, Integer age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public penguin(String name, Integer age, String sex, Integer heignt) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.heignt = heignt;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    };
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public Integer getHeignt() {
        return heignt;
    }
    public void setHeignt(Integer heignt) {
        this.heignt = heignt;
    };
    public void print() {
        String str = "name:" + name;
        str += (age == null) ? "" : ",age:" + age;
        str += (sex == null) ? "" : ",sex:" + sex;
        str += (heignt == null) ? "" : ",age:" + heignt;
        System.out.println(str);
    }
}
