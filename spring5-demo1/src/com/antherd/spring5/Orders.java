package com.antherd.spring5;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 使用有参数构造进行注入属性
 */
public class Orders {

  private String oname;
  private String address;

  // 有参数构造
  public Orders(String oname, String address) {
    this.oname = oname;
    this.address = address;
  }

  public void ordersTest() {
    System.out.println(oname + "::" + address);
  }
}
