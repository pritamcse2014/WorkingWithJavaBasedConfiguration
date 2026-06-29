package org.example;

import org.example.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Desktop desktop = (Desktop)context.getBean("desktop");
        desktop.compile();


//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Alien alien1 = context.getBean("alien",  Alien.class);
//        alien1.setAge(21);
//        System.out.println(alien1.getAge());
//        alien1.code();

//        Desktop desktop = context.getBean("computer2", Desktop.class);
//        Desktop desktop = context.getBean(Desktop.class);
//        Computer computer = context.getBean(Computer.class);
    }
}
