package cn.fyupeng.client;

import cn.fyupeng.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Path;
import java.util.List;

/**
 * @Auther: fyp
 * @Date: 2022/9/6
 * @Description:
 * @Package: cn.fyupeng.client
 * @Version: 1.0
 */
@FeignClient("user-service")
public interface UserClient {

    @GetMapping(value = "/user/find/{stuId}")
    User find(@PathVariable String stuId);

    @GetMapping(value = "/user/findAll")
    List<User> findAll();

    @PostMapping(value = "/user/add")
    List<User> add(@RequestBody User user);

    @PostMapping(value = "/user/update")
    List<User> update(@RequestBody User user);

    @GetMapping(value = "/user/delete/{stuId}")
    List<User> delete(@PathVariable String stuId);


}
