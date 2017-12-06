package com.jd.ebs.module.test.mapper;

import com.jd.ebs.jframework.mapper.MyMapper;
import com.jd.ebs.module.test.model.UserTest;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by trons on 16-4-17.
 */
@Repository("userTestMapper")
@Mapper
public interface UserTestMapper extends MyMapper<UserTest> {
    @Results(id = "userResult", value = {
            @Result(property = "id", column = "id", id = true),
            @Result(property = "name", column = "name"),
            @Result(property = "age", column = "age"),
            @Result(property = "createTime", column = "create_time")
    })
    @Select("select * from user_test where id = #{id}")
    UserTest findUserInfo(@Param("id") int id);

    @ResultMap("userResult")
    @Select("select * from ${tableName}")
    List<UserTest> getAllUser2(@Param("tableName") String tableName);

    @ResultMap("userResult")
    @Select("select * from user_test")
    List<UserTest> getAllUser();

    @Insert("insert into user_test(`name`,`age`) values(#{name}, #{age})")
    @SelectKey(statement = "select last_insert_id()", keyProperty = "id", before = false, resultType = int.class)
    int insertUser(UserTest user);

    @Delete("delete from user_test where id=#{id}")
    int deleteUser(int id);

    @Update("update user_test set name=#{name},age=#{age} where id=#{id}")
    int updateUser(UserTest user);

}