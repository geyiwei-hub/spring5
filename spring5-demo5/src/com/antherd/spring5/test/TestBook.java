package com.antherd.spring5.test;

import com.antherd.spring5.entity.Book;
import com.antherd.spring5.service.BookService;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBook {

  @Test
  public void testJdbcTemplate() {
    ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
    BookService bookService = context.getBean("bookService", BookService.class);

//    // 添加
//    Book book = new Book();
//    book.setUserId(1L);
//    book.setUsername("java");
//    book.setUstatus("a");
//    bookService.addBook(book);

//    // 修改
//    Book book = new Book();
//    book.setUserId(1L);
//    book.setUsername("java update");
//    book.setUstatus("antherd");
//    bookService.updateBook(book);

//    // 删除
//    bookService.deleteBook(1L);

//    // 查询返回某个值
//    int count = bookService.findCount();
//    System.out.println(count);

//    // 查询表记录
//    int count = bookService.findCount();
//    System.out.println(count);

//    // 查询返回对象
//    Book book = bookService.findOne(1L);
//    System.out.println(book);

//    // 查询返回集合
//    List<Book> all = bookService.findAll();
//    System.out.println(all);

//    // 批量添加
//    List<Object[]> batchArgs = new ArrayList<>();
//    Object[] o1 = {"3", "java", "a"};
//    Object[] o2 = {"4", "c++", "b"};
//    Object[] o3 = {"5", "mysql", "c"};
//    batchArgs.add(o1);
//    batchArgs.add(o2);
//    batchArgs.add(o3);
//    // 调用批量添加
//    bookService.batchAdd(batchArgs);

//    // 批量修改
//    List<Object[]> batchArgs = new ArrayList<>();
//    Object[] o1 = {"java0909", "a3", "3"};
//    Object[] o2 = {"c++1010", "b4", "4"};
//    Object[] o3 = {"mysql1111", "c5", "5"};
//    batchArgs.add(o1);
//    batchArgs.add(o2);
//    batchArgs.add(o3);
//    // 调用批量添加
//    bookService.batchUpdate(batchArgs);

    // 批量删除
    List<Object[]> batchArgs = new ArrayList<>();
    Object[] o1 = {"3"};
    Object[] o2 = {"4"};
    batchArgs.add(o1);
    batchArgs.add(o2);
    // 调用方法实现批量修改
    bookService.batchDelete(batchArgs);
  }
}
