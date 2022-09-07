package cn.fyupeng.service;

import cn.fyupeng.pojo.User;

import java.util.List;

/**
 * @Auther: fyp
 * @Date: 2022/8/31
 * @Description:
 * @Package: cn.fyupeng.service
 * @Version: 1.0
 */
public interface UserService {

    User queryUserById(String s);

    List<User> queryAllUsers();

    List<User> add(User user);

    List<User> update(User user);

    List<User> delete(String stuId);
}
