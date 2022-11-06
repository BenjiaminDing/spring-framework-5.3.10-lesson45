package com.zhouyu.zhouyuBeanProcess;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.support.MergedBeanDefinitionPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * created     by benjiamin at 2022-11-04 / 22:12 /12
 */

@Component
public class YellowPeopleMergedBeanDefinitionPostProcessor2 implements MergedBeanDefinitionPostProcessor {


	/**
	 * 初始化之后(Initialization)
	 * @param bean the new bean instance
	 * @param beanName the name of the bean
	 * @return
	 * @throws BeansException
	 */
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {


		return  null;
	}

	/**
	 *  初始化之前(Initialization)
	 *  该方法可以处理所有使用@Compoent注解的
	 * @param bean the new bean instance
	 * @param beanName the name of the bean
	 * @return
	 * @throws BeansException
	 */
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {


		return  null;
	}


	@Override
	public void postProcessMergedBeanDefinition(RootBeanDefinition beanDefinition, Class<?> beanType, String beanName) {

if (beanName.equals("yellowPeople"))
	System.out.println("merge--开始");
	beanDefinition.setInitMethodName("appConfigMethodTest");
		System.out.println("merge--结束");

	}

	@Override
	public void resetBeanDefinition(String beanName) {

	}
}
