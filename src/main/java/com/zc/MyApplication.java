package com.zc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/*
 *   @创建人  zc
 *   @创建时间 2020/9/11 1:34
 *   @创建时间 2020/9/11 1:37
 *   @包名: com.zc
 *   @描述：
 */

@EnableJpaRepositories(basePackages={"com.zc.dao"})
@EntityScan("com.zc.entity")
@SpringBootApplication
public class MyApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class);
    }
}
