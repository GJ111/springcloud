package com.yi_ling.demo01.service.serviceImpl;

import com.yi_ling.demo01.Dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserImpl implements User {
    @Autowired
    private UserDao userDao;

    @Override
    public String add() {
        return userDao.add();
    }
}
