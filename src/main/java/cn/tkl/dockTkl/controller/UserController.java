package cn.tkl.dockTkl.controller;

import cn.tkl.dockTkl.pojo.User;
import cn.tkl.dockTkl.service.UserService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
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

    @ApiOperation(value="获取用户详细信息", notes="根据url的id来获取用户详细信息")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long")
    @GetMapping("{id}")
    public User queryUserById(@PathVariable("id")Long id){
        //根据id查询用户
        return this.userService.queryById(id);
    }
    @ApiOperation(value="测试", notes="")
    @GetMapping("hello")
    public String test(){
        return "hello ssm";
    }

    @ApiOperation(value="获取用户列表", notes="")
    @GetMapping("/list")
    public List<User> all() {
        // 查询用户
        List<User> users = userService.queryAll();
        return users;
    }
}
