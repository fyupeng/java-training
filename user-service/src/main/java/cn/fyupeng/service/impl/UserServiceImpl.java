package cn.fyupeng.service.impl;

import cn.fyupeng.mapper.UserMapper;
import cn.fyupeng.pojo.User;
import cn.fyupeng.service.UserService;
import org.n3r.idworker.Sid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Auther: fyp
 * @Date: 2022/8/31
 * @Description:
 * @Package: cn.fyupeng.service.impl
 * @Version: 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryUserById(String userId) {
        return userMapper.selectByPrimaryKey(userId);
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public List<User> queryAllUsers() {
        return userMapper.selectAll();
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public List<User> add(User user) {
        user.setId(Sid.next());
        userMapper.insert(user);
        return queryAllUsers();
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public List<User> update(User user) {
        userMapper.updateByPrimaryKeySelective(user);
        return queryAllUsers();
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public List<User> delete(String stuId) {
        userMapper.deleteByPrimaryKey(stuId);
        return queryAllUsers();
    }


}
