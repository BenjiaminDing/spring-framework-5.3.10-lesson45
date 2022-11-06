package com.zhouyu.service.lookup;


import com.zhouyu.AppConfig;
import com.zhouyu.service.user.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test3 {

	public static void main(String[] args) {

		userServiceM2();
	}

            public static  void userServiceM2() {
				// 创建一个Spring容器
				AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

				UserServiceLookUpDemo2 LookUpDemo2 = (UserServiceLookUpDemo2) applicationContext.getBean("userServiceLookUpDemo2");
				LookUpDemo2.med1();
				LookUpDemo2.med1();
				LookUpDemo2.med1();


			}
}







