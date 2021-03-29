package com.shsxt.house.dao;
import com.shsxt.house.po.User;
import com.shsxt.house.query.UserQuery;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface UserDao {
    public User queryUserByName(@Param("userName") String userName);
    public List<User> queryAllUser();
    public int insertUser(User user);
    public int deleteUserByName(@Param("userName") String userName);
    public int updateUserByName(User user);
    public List<User> queryUserList(UserQuery userQuery);
}