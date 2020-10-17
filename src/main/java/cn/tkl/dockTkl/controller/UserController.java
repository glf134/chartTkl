package cn.tkl.dockTkl.controller;

import cn.tkl.dockTkl.pojo.User;
import cn.tkl.dockTkl.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("{id}")
    public User queryUserById(@PathVariable("id")Long id){
        return this.userService.queryById(id);
    }

    @GetMapping("hello")
    public String test(){
        return "hello ssm";
    }

    @GetMapping("/list")
    public List<User> all(ModelMap model) {
        // 查询用户
        List<User> users = this.userService.queryAll();
        return users;
    }
}