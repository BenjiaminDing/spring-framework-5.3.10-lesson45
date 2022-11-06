package com.zhouyu.construct;


import com.zhouyu.AppConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestCon {

	public static void main(String[] args) {

		userServiceM2();


	}

    public static void userServiceM2() {
		// 创建一个Spring容器
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

		WrapperService wrapperService = (WrapperService) applicationContext.getBean("wrapperService",new OrderService());
		wrapperService.test();
        }



	public static void userServiceM1() {
		// 创建一个Spring容器
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

		WrapperService wrapperService =  applicationContext.getBean("wrapperService",WrapperService.class);
		wrapperService.test();
	}
}







