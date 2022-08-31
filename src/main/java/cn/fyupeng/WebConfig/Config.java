package cn.fyupeng.WebConfig;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: fyp
 * @Date: 2022/8/30
 * @Description:
 * @Package: cn.fyupeng.WebConfig
 * @Version: 1.0
 */
@Configuration
public class Config {
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        return builder.build();
    }
}
