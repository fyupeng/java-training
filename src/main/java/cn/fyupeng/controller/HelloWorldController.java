package cn.fyupeng.controller;

import cn.fyupeng.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: fyp
 * @Date: 2022/8/30
 * @Description:
 * @Package: cn.fyupeng
 * @Version: 1.0
 */
@RestController
@RequestMapping("/test")
public class HelloWorldController {

    @RequestMapping("/helloWorld")
    public String testHelloWorld(String message) {
        return "hello this is message for you: " + message;
    }

    @GetMapping("/getStudent/{stuId}")
    public Student getStudent(@PathVariable String stuId) {
        Student student = new Student();
        student.setId(stuId);
        student.setName("小明");
        student.setSex("男");
        return student;
    }

}
