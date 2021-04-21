package com.shsxt.house.controller;
import com.github.pagehelper.PageInfo;
import com.shsxt.house.po.User;
import com.shsxt.house.query.UserQuery;
import com.shsxt.house.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;
@RequestMapping("/user")
@RestController
@Api(tags = "用户模块")
public class UserController {
    @Resource
    private UserService userService;
    @GetMapping("login")
    @ApiOperation(value = "登录",notes = "根据用户名验证密码身份")
    @ApiImplicitParam(name = "userName",value = "用户名",required = true,dataType = "String",paramType = "前端传值")
    public Object queryUserByName(String userName,String userPwd,String userRole){
        Map<Object,Object> map=new HashMap<>();
        User user= userService.queryUserByName(userName);
        if (user==null){
            map.put("msg","账户不存在");
            map.put("code",300);
        }else if (!user.getUserPwd().equals(userPwd)){
            map.put("msg","密码错误");
            map.put("code",300);
        }else if (!user.getUserRole().equals(userRole)){
            map.put("msg","身份错误");
            map.put("code",300);
        }else {
            map.put("msg","登录成功");
            map.put("code",200);
        }
        return map;
    }
    @GetMapping("beforeUpdate")
    public User beforeUpdate(String userName){
        return userService.queryUserByName(userName);
    }
    @GetMapping("queryUser")
    @ApiOperation(value = "查询所有用户")
    public Object queryAllUser(){
        Map<Object,Object> map=new HashMap<>();
        map.put("user",userService.queryAllUser());
        return map;
    }
    @PostMapping("addUser")
    @ApiOperation(value = "添加用户")
    @ApiImplicitParam(name = "user",value = "用户信息",required = true,dataType = "User")
    public Object insertUser(@RequestBody User user){
        Map<Object,Object> map=new HashMap<>();
        System.out.println(user.getUserName());
        User temp=userService.queryUserByName(user.getUserName());
        if (temp==null){
            if (userService.insertUser(user)==1){
                map.put("msg","成功");
                map.put("code",200);
                return map;
            }else {
                map.put("msg","失败");
                map.put("code",300);
                return map;
            }
        }else {
            map.put("msg","用户名已存在");
            map.put("code",300);
            return map;
        }
    }
    @DeleteMapping("deleteUser")
    public Object deleteUserByName(String userName){
        Map<Object,Object> map=new HashMap<>();
        if (userService.deleteUserByName(userName)==1){
            map.put("msg","删除成功");
            map.put("code",200);
        }else {
            map.put("msg","删除失败");
            map.put("code",300);
        }
        return map;
    }
    @PutMapping("updateUser")
    public Object updateUserByName(@RequestBody User user){
        Map<Object,Object> map=new HashMap<>();
        if (userService.updateUserByName(user)==1){
            map.put("msg","修改成功");
            map.put("code",200);
        }else {
            map.put("msg","修改失败");
            map.put("code",300);
        }
        return map;
    }
    @GetMapping("userList")
    public PageInfo<User> queryUserList(UserQuery userQuery){
        return userService.queryUserList(userQuery);
    }
    @GetMapping("queryUserById")
    public String queryUserById(Integer userId){
        return userService.queryUserById(userId);
    }
}