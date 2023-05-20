package com.mvc.mapper;

import com.mvc.pojo.course;
import com.mvc.pojo.user;

import java.util.List;

public interface UserMapper {
    List<course> findAll()throws Exception;
    void insertcourse(course course)throws Exception;
    void updatecourse(course course)throws Exception;
    void deletecourse(int id)throws Exception;
    void updateCourse(course course)throws Exception;
    void updateByname(course course)throws Exception;
    String selectPassward(String name)throws Exception;
    void insertUser(user user)throws Exception;
}
