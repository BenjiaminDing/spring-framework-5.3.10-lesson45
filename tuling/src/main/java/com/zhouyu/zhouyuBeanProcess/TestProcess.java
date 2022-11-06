package com.zhouyu.zhouyuBeanProcess;

import com.zhouyu.AppConfig;
import org.springframework.beans.factory.annotation.AnnotatedBeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * created     by benjiamin at 2022-11-04 / 22:19 /19
 */
public class TestProcess {

	public static void main(String[] args) {
		benProcess();
	}
	public static  void benProcess() {

		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);


		Object  yellowPeople=		applicationContext.getBean("yellowPeople");
          YellowPeople ss= (YellowPeople)(yellowPeople);
	}
}
