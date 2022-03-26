package cn.bigcoder.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: Jindong.Tian
 * @date: 2022-03-26
 **/
public class Hello {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:application-context.xml");
        Object user = applicationContext.getBean("userFactoryBean");
        System.out.println(user);
    }
}
