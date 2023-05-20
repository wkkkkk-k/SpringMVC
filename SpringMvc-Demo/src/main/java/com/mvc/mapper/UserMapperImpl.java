package com.mvc.mapper;

import com.mvc.pojo.course;
import com.mvc.pojo.user;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.util.List;

public class UserMapperImpl implements UserMapper {
    @Override
    public List<course> findAll() throws Exception {
        SqlSession sql = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("MybatisConfig.xml")).openSession();
        List<course> list=sql.selectList("com.mvc.mapper.UserMapper.findAll");
        return list;
    }

    @Override
    public void insertcourse(course course) throws Exception {
        SqlSession sql=new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("MybatisConfig.xml")).openSession(true);
        sql.insert("com.mvc.mapper.UserMapper.insertcourse",course);
        sql.close();
    }

    @Override
    public void updatecourse(course course) throws Exception {
        SqlSession sql=new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("MybatisConfig.xml")).openSession(true);
        sql.update("com.mvc.mapper.UserMapper.updatecourse",course);
        sql.close();
    }

    @Override
    public void deletecourse(int id) throws Exception {
        SqlSession sql = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("MybatisConfig.xml")).openSession(true);
        sql.update("com.mvc.mapper.UserMapper.deletecourse", id);
        sql.close();
    }

    @Override
    public void updateCourse(course course) throws Exception {
        SqlSession sql=new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("MybatisConfig.xml")).openSession(true);
        sql.update("com.mvc.mapper.Usermapper.deletecourse",course);
        sql.close();
    }

    @Override
    public void updateByname(course course) throws Exception {
        SqlSession sql=new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("MybatisConfig,xml")).openSession(true);
        sql.update("com.mvc.mapper.UserMapper.updateByname",course);
        sql.close();
    }

    @Override
    public String selectPassward(String name) throws Exception {
       SqlSession sql=new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("MybatisConfig.xml")).openSession();
       String passward=sql.selectOne("com.mvc.mapper.UserMapper.selectPassward",name);
        return passward;
    }

    @Override
    public void insertUser(user user) throws Exception {
        SqlSession sql=new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("MybatisConfig.xml")).openSession(true);
        sql.insert("com.mvc.mapper.UserMapper.insertUser",user);
        sql.close();
    }
}
