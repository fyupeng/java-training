package cn.fyupeng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Auther: fyp
 * @Date: 2022/8/30
 * @Description:
 * @Package: cn.fyupeng
 * @Version: 1.0
 */
@SpringBootApplication
@ComponentScan(basePackages = {"cn.fyupeng","cn"})
public class FyupengApplication {
    public static void main(String[] args) {
        SpringApplication.run(FyupengApplication.class, args);
    }
}
