package com.xiaolong.shujuku.dao;

import com.xiaolong.shujuku.bean.Student;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface studentmapper {

    @Select("select * from student")
    @Results({
            @Result(column = "id",property = "id"),
            @Result(column = "name",property = "name")
    })
    public List<Student> findall();

    @Insert("insert into student values(#{ID},#{Name})")
    public int insert(@Param("ID") int id,@Param("Name") String name);

    @Update("update student set name=#{name} where id=#{id}")
    public int update(String name,int id);

    @Delete("delete from student where id=#{id}")
    public int del(int id);



}
