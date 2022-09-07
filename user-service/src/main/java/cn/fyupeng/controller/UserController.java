package cn.fyupeng.controller;

import cn.fyupeng.pojo.User;
import cn.fyupeng.service.UserService;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.DiscoveryClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

/**
 * @Auther: fyp
 * @Date: 2022/8/31
 * @Description:
 * @Package: cn.fyupeng.controller
 * @Version: 1.0
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/find/{id}")
    public User find(@PathVariable String id) {
        User user = userService.queryUserById(id);
        return user;
    }

    @GetMapping(value = "/findAll")
    public List<User> findAll() {
        List<User> userList = userService.queryAllUsers();
        return userList;
    }

    @PostMapping(value = "/add")
    public List<User> add(@RequestBody User user) {
        List<User> userList = userService.add(user);
        return userList;
    }

    @PostMapping(value = "/update")
    public List<User> update(@RequestBody User user) {
        List<User> userList = userService.update(user);
        return userList;
    }

    @GetMapping(value = "/delete/{id}")
    public List<User> delete(@PathVariable String id) {
        List<User> userList = userService.delete(id);
        return userList;
    }

}
