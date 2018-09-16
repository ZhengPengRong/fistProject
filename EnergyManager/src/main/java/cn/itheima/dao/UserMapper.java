package cn.itheima.dao;

import java.util.ArrayList;

import cn.itheima.pojo.User;

public interface UserMapper {
	User findUserById(int id);
	ArrayList<User> findUserList();
	User findUserByUserName(String name);
	User checkUser(User user);
    void insertUser(User user); 
}