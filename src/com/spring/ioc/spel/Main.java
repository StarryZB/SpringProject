package com.spring.ioc.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by StarryZB on 2018/1/25.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans-spel.xml");
        Address address = (Address) applicationContext.getBean("address");
        System.out.println(address);
        Car car = (Car) applicationContext.getBean("car");
        System.out.println(car);
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person);
    }

}
