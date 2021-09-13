package com.note.miaosha.dao;

import com.note.miaosha.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author 18530
 */
@Mapper
public interface UserDao {

    /**
     * 获取用户
     * @param id
     * @return
     */
    @Select("select * from User where id = #{id}")
    User getUserById(@Param("id") int id);

}
