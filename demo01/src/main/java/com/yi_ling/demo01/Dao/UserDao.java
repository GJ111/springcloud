package com.yi_ling.demo01.Dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Mapper
public interface UserDao {
    @Select("select * from user")
    String add();
}
