package com.shsxt.house.service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shsxt.house.dao.UserDao;
import com.shsxt.house.po.User;
import com.shsxt.house.query.UserQuery;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
public class UserService {
    @Resource
    private UserDao userDao;
    //@Cacheable(value = "users",key = "#userName")
    public User queryUserByName(String userName){
        return userDao.queryUserByName(userName);
    }
    public List<User> queryAllUser(){
        return userDao.queryAllUser();
    }
    //@CachePut(value = "users",key = "#user.userName")
    //@Transactional(propagation = Propagation.REQUIRED)
    public int insertUser(User user){
        return userDao.insertUser(user);
    }
    //@CacheEvict(value = "users",key = "#userName")
    //@Transactional(propagation = Propagation.REQUIRED)
    public int deleteUserByName( String userName){
        return userDao.deleteUserByName(userName);
    }
    //@Transactional(propagation = Propagation.REQUIRED)
    public int updateUserByName(User user){
        return userDao.updateUserByName(user);
    }
    public PageInfo<User> queryUserList(UserQuery userQuery){
        PageHelper.startPage(userQuery.getPageNum(),userQuery.getPageSize());
        return new  PageInfo<User>(userDao.queryUserList(userQuery));
    }
}