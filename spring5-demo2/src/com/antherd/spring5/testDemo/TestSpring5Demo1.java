package com.antherd.spring5.testDemo;

import com.antherd.spring5.autowire.Emp;
import com.antherd.spring5.bean.Orders;
import com.antherd.spring5.collectiontype.Book;
import com.antherd.spring5.collectiontype.Course;
import com.antherd.spring5.collectiontype.Stu;
import com.antherd.spring5.factoryBean.MyBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5Demo1 {

  @Test
  public void testCollection() {
    ApplicationContext context =
        new ClassPathXmlApplicationContext("bean1.xml");
    Stu stu = context.getBean("stu", Stu.class);
    stu.test();
  }

  @Test
  public void testCollection2() {
    ApplicationContext context =
        new ClassPathXmlApplicationContext("bean2.xml");
//    Book book = context.getBean("book", Book.class);
//    book.test();
    Book book1 = context.getBean("book", Book.class);
    Book book2 = context.getBean("book", Book.class);
    System.out.println(book1);
    System.out.println(book2);
  }

  @Test
  public void testCollection3() {
    ApplicationContext context =
        new ClassPathXmlApplicationContext("bean3.xml");
    Course course = context.getBean("myBean", Course.class);
    System.out.println(course);
  }

  @Test
  public void testBean3() {
//    ApplicationContext context =
//        new ClassPathXmlApplicationContext("bean4.xml");
    ClassPathXmlApplicationContext context =
        new ClassPathXmlApplicationContext("bean4.xml");
    Orders orders = context.getBean("orders", Orders.class);
    System.out.println("第四步 获取创建bean的对象实例");
    System.out.println(orders);

    // 手动挡bean实例销毁
//    ((ClassPathXmlApplicationContext)context).close();
    context.close();
  }

  @Test
  public void test4() {
    ApplicationContext context =
        new ClassPathXmlApplicationContext("bean5.xml");
    Emp emp = context.getBean("emp", Emp.class);
    System.out.println(emp);
  }
}
