package com.example.homework11.test5;

/**
 * @date 2023/12/9 20:34
 */
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "com.example.homework11.test5")
public class AppConfig {
    // 这里可以定义bean，但由于我们使用了@Component注解，所以不需要手动定义
}