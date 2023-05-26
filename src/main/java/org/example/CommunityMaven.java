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
 * @Description:
 */
@SpringBootApplication
@MapperScan("org.example.dao")
public class CommunityMaven {
    public static void main() {
        SpringApplication.run(CommunityMaven.class, args);
    }
}


