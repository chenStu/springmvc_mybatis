package cjs.ssm.controller;

import cjs.ssm.po.User;
import cjs.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findAllUser")
    public ModelAndView findAllUser() throws Exception {
        List<User> userList = userService.findAllUser();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userList", userList);
        modelAndView.setViewName("user");
        return modelAndView;
    }
    @RequestMapping(value = "/findUserByName", method = {RequestMethod.POST})
    public ModelAndView findUserByName(String name) throws Exception{
        List<User> userList = userService.findUserByName(name);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userList", userList);
        modelAndView.setViewName("user");
        return modelAndView;
    }
    @RequestMapping("/findUserById")
    public ModelAndView findUserById(Integer id) throws Exception{
        ModelAndView modelAndView = new ModelAndView();
        User user = userService.findUserById(id);
        modelAndView.addObject("user",user);
        modelAndView.setViewName("update");
        return modelAndView;
    }
    @RequestMapping(value = "/insertUser", method = {RequestMethod.POST})
    public String insertUser(User user) throws Exception{
        userService.insertUser(user);
        return "forward:findAllUser.action";
    }
    @RequestMapping(value = "/updateUser",method = {RequestMethod.POST})
    public String updateUser(User user) throws Exception{
        System.out.println(user);
        userService.updateUser(user);
        return "forward:findAllUser.action";
    }
    @RequestMapping("/deleteUser")
    public String deleteUser(Integer id) throws Exception{
        userService.deleteUser(id);
        return "forward:findAllUser.action";
    }
}
