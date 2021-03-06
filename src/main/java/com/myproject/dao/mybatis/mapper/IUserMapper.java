package com.myproject.dao.mybatis.mapper;

import com.myproject.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface IUserMapper {
    User getUserByID(@Param("id") int id);

    @Insert("insert into user(id,name, dept,phone,website,birthday) values(#{id},#{name}, #{dept},#{phone}, #{website}, #{birthday})")
    int insertUser(User user);

    @Delete("delete from user where id=#{id}")
    int deleteUserById(int id);

    @Update("update user set name=#{name},dept=#{dept},phone=#{phone},website=#{website},birthday=#{birthday} where id=#{id}")
    int updateUser(User user);

    @Select("select * from user")
    List<User> getAllUser();
}
