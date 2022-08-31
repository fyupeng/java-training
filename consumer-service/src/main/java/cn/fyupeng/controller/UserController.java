package cn.fyupeng.controller;

import cn.fyupeng.pojo.User;
import com.netflix.appinfo.InstanceInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "/findUser/{stuId}")
    public User findUser(@PathVariable String stuId) throws ParseException {
        List<ServiceInstance> instanceList = discoveryClient.getInstances("user-service");
        ServiceInstance serviceInstance = instanceList.get(0);

        String url = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/user/findUser/" + stuId;
        System.out.println(url);
        return restTemplate.getForObject(url, User.class);
    }

}
