package com.zhouyu;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.zhouyu.zhouyuBeanProcess")

public class AppConfig {

      @Bean
	public void appConfigMethodTest() {
		System.out.println("appConfigMethodTest---");

	}

}

