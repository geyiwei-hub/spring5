package com.antherd.spring5.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

  @Override
  public void add() {
    System.out.println("dao add...........");
  }
}
