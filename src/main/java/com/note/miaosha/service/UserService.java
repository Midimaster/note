package com.note.miaosha.service;

import com.note.miaosha.dao.UserDao;
import com.note.miaosha.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 18530
 */
@Service
public class UserService {

    //    @Transactional //事务注解

    @Autowired
    UserDao userDao;

    /**
     *
     * @param id
     * @return
     */
    public User getUserById(int id) {
        return userDao.getUserById(id);
    }

}
