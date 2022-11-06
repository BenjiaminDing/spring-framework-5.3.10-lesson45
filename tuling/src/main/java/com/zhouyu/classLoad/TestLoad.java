package com.zhouyu.classLoad;

import com.zhouyu.AppConfig;
import com.zhouyu.construct.OrderService;
import com.zhouyu.construct.WrapperService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.util.ClassUtils;

/**
 * created     by benjiamin at 2022-11-04 / 13:04 /04
 */
public class TestLoad {
	public static void main(String[] args) {

	}

	/**
	 * 框架有一个默认的类加载器
	 * 	/** ClassLoader to resolve bean class names with, if necessary.
	 private ClassLoader beanClassLoader = ClassUtils.getDefaultClassLoader();

	 我们也可以指定类加载器
	 */
	public static void userServiceM2() {

//		Thread.currentThread().setContextClassLoader();
		// 创建一个Spring容器
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
//		applicationContext.getBeanFactory().setBeanClassLoader();

		WrapperService wrapperService = (WrapperService) applicationContext.getBean("chinaPhone");
		wrapperService.test();
	}
}

