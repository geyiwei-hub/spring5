package com.antherd.spring5;

/**
 * 演示使用set方法进行注入属性
 */
public class Book {

  // 创建属性
  private String bname;
  private String bauther;
  private String address;

  // 创建属性对应的set方法
  public void setBname(String bname) {
    this.bname = bname;
  }

  public void setBauther(String bauther) {
    this.bauther = bauther;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public void testDemo() {
    System.out.println(bname + "::" + bauther + "::" + address);
  }
}
