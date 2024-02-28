package com.example.dao;


import com.example.model.User;

import java.util.List;

public interface UserDao {

   void delete(long id);

   void update(long id, User user);

   User getUserById(long id);

   void add(User user);

   List<User> listUsers();
}
