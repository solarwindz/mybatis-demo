package com.mybatisdemo.dao;

import com.mybatisdemo.entity.User;

public interface IUserDao {
    public User findUserById(int id) throws  Exception;
}
