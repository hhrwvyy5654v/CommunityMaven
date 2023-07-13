package org.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Project: CommunityMaven
 * @Package: org.example
 * @ClassName: CommunityMaven
 * @Datetime: 2023/05/26 14:54
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 一个Spring Boot应用的启动类
 */
// 注解表示这是一个Spring Boot应用的入口类。它是一个组合注解，包含了多个注解的功能，包括@Configuration、@EnableAutoConfiguration和@ComponentScan
@SpringBootApplication
@MapperScan("org.example.dao")  // 注解表示扫描指定包及其子包下的Mapper接口，用于与数据库进行交互

public class CommunityMavenApplication {
    public static void main() {
        SpringApplication.run(CommunityMavenApplication.class);
    }
}


