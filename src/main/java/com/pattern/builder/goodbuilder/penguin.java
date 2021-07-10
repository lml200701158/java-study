package com.pattern.builder.goodbuilder;

public class penguin {
    private String  name;
    private Integer age;
    private String  sex;
    private Integer heignt;

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

    public penguin(penguinBuilder builder) {
        this.age = builder.age;
        this.name = builder.name;
        this.sex = builder.sex;
        this.heignt = builder.heignt;
    }

    public static class penguinBuilder {
        private String  name;
        private Integer age;
        private String  sex;
        private Integer heignt;

        public penguinBuilder setName(String name) {
            this.name = name;
            return this;
        }
        public penguinBuilder setAge(Integer age) {
            this.age = age;
            return this;
        }
        public penguinBuilder setSex(String sex) {
            this.sex = sex;
            return this;
        }
        public penguinBuilder setHeignt(Integer heignt) {
            this.heignt = heignt;
            return this;
        }
        public penguin bulid() {
            return new penguin(this);
        }
    }
}
