package com.zhouyu;


import com.zhouyu.service.user.UserService;
import com.zhouyu.service.lookup.UserServiceLookUpDemo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {

		userServiceM1();


	}

    public static void userServiceM1() {
		// 创建一个Spring容器
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

		UserService userService = (UserService) applicationContext.getBean("userService");
		userService.test();
        }

}







