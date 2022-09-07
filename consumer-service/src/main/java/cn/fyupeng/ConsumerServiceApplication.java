package cn.fyupeng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Auther: fyp
 * @Date: 2022/8/31
 * @Description:
 * @Package: cn.fyupeng
 * @Version: 1.0
 */

@EnableFeignClients
@SpringBootApplication
@EnableEurekaServer
public class ConsumerServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerServiceApplication.class, args);
    }
}
