package com.zhouyu.zhouyuBeanProcess;

import com.zhouyu.service.user.User;
import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

import java.beans.PropertyDescriptor;

/**
 * created     by benjiamin at 2022-11-04 / 22:12 /12
 */

@Component
public class YellowPeopleBeanPostProcessor3 implements InstantiationAwareBeanPostProcessor {


	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {

		System.out.println("YellowPeopleBeanPostProcessor--BeforeInstantiation实例化");
		return null;
	}

	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
//		System.out.println("YellowPeopleBeanPostProcessor--AfterInstantiation实例化");
		return false;
	}

	@Override
	public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
// PropertyValues pvsToUse = bp.postProcessProperties(pvs, bw.getWrappedInstance(), beanName);  源码传参执行该方法的地方
		// 所用这个方法具体方法体如何执行，是开发人员自己定义

		System.out.println("YellowPeopleBeanPostProcessor--postProcessProperties");
		return null;
	}

	@Override
	public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean, String beanName) throws BeansException {
		return null;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		return null;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		return null;
	}
}
