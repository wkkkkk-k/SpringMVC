package com.mvc.demo.controller;

import com.mvc.mapper.UserMapper;
import com.mvc.mapper.UserMapperImpl;
import com.mvc.pojo.course;
import com.mvc.pojo.user;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("/hello")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class HelloMvcController {
    @RequestMapping("/login")
    public ModelAndView login(String name,String passward,String captcha, HttpSession session)throws Exception{
        String captchaSession=(String) session.getAttribute("captcha");
        if(captcha!=null){
            if (captchaSession.equalsIgnoreCase(captcha)) {
                UserMapper userMapper = new UserMapperImpl();
                String pass = userMapper.selectPassward(name);
                if (pass != null && passward.equals(pass)) {
                    return new ModelAndView("redirect:/hello/test1");
                }
            }
        }
        return new ModelAndView("login");
    }
    @RequestMapping("/register")
    public ModelAndView register(String name,String passward1,String passward2)throws Exception {
        if (passward1.equals(passward2)) {
            user user = new user();
            user.setName(name);
            user.setPassward(passward1);
            UserMapper userMapper=new UserMapperImpl();
            userMapper.insertUser(user);
            return new ModelAndView("login");
        }else{
            return new ModelAndView("redirect:/hello/register");
        }
    }
    @RequestMapping("toregister")
    public ModelAndView toregister(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("register");
        return modelAndView;
    }
    @RequestMapping("/test1")
    public ModelAndView test1() throws Exception {
        UserMapper userMapper = new UserMapperImpl();
        List<course> list = userMapper.findAll();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("list", list);
        modelAndView.setViewName("test1");
        return modelAndView;
    }

    @RequestMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable int id) throws Exception {
        UserMapper userMapper = new UserMapperImpl();
        userMapper.deletecourse(id);
        return new ModelAndView("redirect:/hello/test1");
    }

    @RequestMapping("/toupdate/{id}")
    public ModelAndView toupdate(@PathVariable int id){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("update");
        return modelAndView;
    }
    @RequestMapping("/updatecourse")
    public ModelAndView updatecourse(@RequestParam("name") String name, @RequestParam("hours") int hours, @RequestParam("school") int school) throws Exception{
        UserMapper userMapper = new UserMapperImpl();
        course course = new course();
        course.setId(100);
        course.setName(name);
        course.setHours(hours);
        course.setSchool(school);
        userMapper.updateByname(course);
        return new ModelAndView("redirect:/hello/test1");

    }

    @RequestMapping("/addCourse")
    public void addCourse(@RequestParam("id") int id, @RequestParam("name") String name, @RequestParam("hours") int hours, @RequestParam("school") int school) throws Exception {
        course course = new course();
        course.setId(id);
        course.setName(name);
        course.setHours(hours);
        course.setSchool(school);
        UserMapper userMapper=new UserMapperImpl();
        userMapper.insertcourse(course);
    }
   @RequestMapping("/addCoursecommit")
    public ModelAndView addCoursecommit(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("addCourse");
       return modelAndView;
    }
}
