package com.java.spring.factorybean2;

import org.springframework.beans.factory.FactoryBean;

public class CarFactoryBean   implements FactoryBean<Car> {
    private  String carInfo ;
    /**
     *	自定义创建bean的过程，可以定制复杂的创建过程
     */
    @Override
    public Car getObject() throws Exception {
        Car car = new Car();
        String[] infos = carInfo.split(",");
        car.setBrand(infos[0]);
        car.setMaxSpeed(Integer.valueOf(infos[1]));
        car.setPrice(Double.valueOf(infos[2]));
        return car;
    }
    /**
     *	获取FactoryBean创建bean的类型
     */
    @Override
    public Class<?> getObjectType() {
        return Car.class;
    }
    /**
     *	创建的bean，是否是单例
     */
    @Override
    public boolean isSingleton() {
        return false;
    }
    public String getCarInfo() {
        return carInfo;
    }
    /**
     *	接受逗号分隔符，设置属性
     */
    public void setCarInfo(String carInfo) {
        this.carInfo = carInfo;
    }
}
