package cn.fyupeng.controller;

import cn.fyupeng.client.UserClient;
import cn.fyupeng.pojo.User;
import cn.fyupeng.utils.JsonUtils;
import com.netflix.appinfo.InstanceInfo;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.util.List;
import java.util.Random;

/**
 * @Auther: fyp
 * @Date: 2022/8/31
 * @Description:
 * @Package: cn.fyupeng.controller
 * @Version: 1.0
 */

@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {

    //@Autowired
    //private RestTemplate restTemplate;
    //
    //@Autowired
    //private DiscoveryClient discoveryClient;
    @Autowired
    private UserClient userClient;

    @RequestMapping(value = "/find/{id}")
    public User findUser(@PathVariable String id) {
        User user = userClient.find(id);
        return user;
    }

    @RequestMapping(value = "/findAll")
    public List<User> findAllUsers() {
        return userClient.findAll();
    }

    @RequestMapping(value = "/add")
    public List<User> addUser(@RequestBody User user) {
        return userClient.add(user);
    }

    @RequestMapping(value = "/update")
    public List<User> updateUser(@RequestBody User user) {
        return userClient.update(user);
    }

    @RequestMapping(value = "/delete/{id}")
    public List<User> deleteUser(@PathVariable String id) {
        return userClient.delete(id);
    }

}
