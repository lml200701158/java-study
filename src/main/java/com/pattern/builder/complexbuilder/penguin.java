package com.pattern.builder.complexbuilder;

public class penguin {
    private String  name;
    private Integer age;
    private String  sex;
    private Integer heignt;

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(Integer age) {
        this.age = age;
    };
    public void setSex(String sex) {
        this.sex = sex;
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

    public static class penguinBuilder {
        private penguin m_penguin = new penguin();
        public penguinBuilder setName(String name) {
            this.m_penguin.setName(name);
            return this;
        }
        public penguinBuilder setAge(Integer age) {
            this.m_penguin.setAge(age);
            return this;
        }
        public penguinBuilder setSex(String sex) {
            this.m_penguin.setSex(sex);
            return this;
        }
        public penguinBuilder setHeignt(Integer heignt) {
            this.m_penguin.setHeignt(heignt);
            return this;
        }
        public penguin bulid() {
            return this.m_penguin;
        }
    }
}
