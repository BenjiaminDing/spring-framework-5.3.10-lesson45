package com.zhouyu.zhouyuBeanProcess;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * created     by benjiamin at 2022-11-04 / 22:12 /12
 */

@Component
public class YellowPeopleBeanPostProcessor implements BeanPostProcessor {


	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

		System.out.println("YellowPeopleBeanPostProcessor--BeforeInitialization");
		return null;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("YellowPeopleBeanPostProcessor--AfterInitialization");
		return null;
	}
}
