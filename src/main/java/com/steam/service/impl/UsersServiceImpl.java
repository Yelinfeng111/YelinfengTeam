package com.steam.service.impl;

import com.steam.dao.UsersDao;
import com.steam.entity.Users;
import com.steam.service.UsersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {
    @Resource
    private UsersDao dao;
    @Override
    public List<Users> queryUsers(Users users) {
        return dao.queryUsers(users);
    }

    @Override
    public Users queryUser(Users users) {
        return null;
    }

    @Override
    public Users login(Users users) {
        return null;
    }

    @Override
    public boolean addUsers(Users users) {
        return false;
    }

    @Override
    public boolean updateUsers(Users users) {
        return false;
    }

    @Override
    public boolean deleteUsers(Users users) {
        return false;
    }
}
