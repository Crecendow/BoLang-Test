package com.bolang;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 功能描述：启动类
 * <p>
 * User: nft musician developer
 * Date: 2022/1/10
 */


@SpringBootApplication
@Slf4j
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
//        log.info("服务启动");
    }

}
