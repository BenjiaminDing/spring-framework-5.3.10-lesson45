package com.zhouyu.dependsOn;


import com.zhouyu.AppConfig;
import com.zhouyu.construct.OrderService;
import com.zhouyu.construct.WrapperService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestDepends {

	public static void main(String[] args) {

		serviceM2();


	}

    public static void serviceM2() {
		// 创建一个Spring容器
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

		Frog frog = (Frog) applicationContext.getBean("frog");
		frog.test();
        }



}







