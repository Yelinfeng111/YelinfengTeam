package com.steam.service;

import com.steam.entity.Users;

import java.util.List;

public interface UsersService {
    List<Users> queryUsers(Users users);
    Users queryUser(Users users);
    Users login(Users users);
    boolean addUsers(Users users);
    boolean updateUsers(Users users);
    boolean deleteUsers(Users users);
}
