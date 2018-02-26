package com.steam.mysteam;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@ComponentScan("com.steam")       //加载@Service @Control注解类
@MapperScan(value="com.steam.dao")  //mybatis 需要扫描dao接口
@EnableWebMvc                   //启用mvc
@EnableTransactionManagement    //启用事务管理
public class MysteamApplication {
	public static void main(String[] args) {
		SpringApplication.run(MysteamApplication.class, args);
	}
}
