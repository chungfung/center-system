package com.system;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 * 
 * @author ruoyi
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
@MapperScan("com.system.*.mapper")
public class HgsoftWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(HgsoftWebApplication.class, args);
        System.out.println("启动成功！");
    }
}