package cn.fyupeng;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Auther: fyp
 * @Date: 2022/8/30
 * @Description:
 * @Package: PACKAGE_NAME
 * @Version: 1.0
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestDemo {

    @Autowired
    private RestTemplate restTemplate;

    @Test
    public void testRestTemplate() {
        String url = "http://localhost:8080/test/getStudent/201910244612";
        String result = restTemplate.getForObject(url, String.class);
        System.out.println(result);
    }
}
