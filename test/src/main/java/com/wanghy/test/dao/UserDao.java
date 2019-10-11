package com.wanghy.test.dao;

import org.apache.ibatis.annotations.Mapper;

/**
 * @ Author     ：WangHY
 * @ Date       ：Created in 15:34 2018/11/12
 * @ Description：
 */
@Mapper
public interface UserDao {

    public int update();
}
