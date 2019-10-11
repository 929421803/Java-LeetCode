package com.wanghy.test.controller;

import com.mysql.jdbc.exceptions.jdbc4.MySQLSyntaxErrorException;
import com.wanghy.test.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Author     ：WangHY
 * @ Date       ：Created in 15:34 2018/11/12
 * @ Description：
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserDao userDao;

    @RequestMapping("/user")
    @Transactional(rollbackFor = Exception.class)
    public String update() throws Exception {
        try {
            userDao.update();
            throw new MySQLSyntaxErrorException("test");
        }catch (Exception e){
            System.out.println("1");
            throw new Exception();
        }
//        return "ok";
    }

    /**
     * @description swagger
     * @param test
     * @return
     */
    @RequestMapping("/swagger")
    @Transactional(rollbackFor = Exception.class)
    public String swagger(@RequestParam String test) {

        return test+"1";
    }
}
