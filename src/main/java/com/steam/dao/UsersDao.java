package com.steam.dao;

import com.steam.entity.Users;

import java.util.List;

public interface UsersDao {
    List<Users> queryUsers(Users users);
    int addUsers(Users users);
    int updateUsers(Users users);
    int deleteUsers(Users users);
}
