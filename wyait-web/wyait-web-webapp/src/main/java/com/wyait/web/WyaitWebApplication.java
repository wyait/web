package com.wyait.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan用于配置扫描com.wyait.web之外的包下面的类
@ComponentScan(basePackages={"com.wyait"})
public class WyaitWebApplication {

	public static void main(String[] args) {
		SpringApplication sa=new SpringApplication(WyaitWebApplication.class);
		// 禁用devTools热部署
		//System.setProperty("spring.devtools.restart.enabled", "false");
		// 禁用命令行更改application.properties属性
		sa.setAddCommandLineProperties(false);
		sa.run(args);
	}
}