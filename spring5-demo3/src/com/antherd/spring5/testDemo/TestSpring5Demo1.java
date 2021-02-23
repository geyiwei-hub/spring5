package com.antherd.spring5.testDemo;

import com.antherd.spring5.config.SpringConfig;
import com.antherd.spring5.service.UserService;
import javax.swing.Spring;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5Demo1 {

  @Test
  public void testService() {
    ApplicationContext context =
        new ClassPathXmlApplicationContext("bean1.xml");
    UserService userService = context.getBean("userService", UserService.class);
    System.out.println(userService);
    userService.add();
  }

  @Test
  public void testService2() {
    ApplicationContext context =
        new AnnotationConfigApplicationContext(SpringConfig.class);
    UserService userService = context.getBean("userService", UserService.class);
    System.out.println(userService);
    userService.add();
  }
}
