package com.zhouyu.smartSingle;

import org.springframework.beans.factory.SmartInitializingSingleton;
import org.springframework.stereotype.Component;

/**
 * created     by benjiamin at 2022-11-01 / 23:06 /06
 * 如果实现了这个接口就 执行这下面这个方法
 */
@Component
public class Pig  implements SmartInitializingSingleton {

	/**  涉及声明周期
	 * 在创建了所有非懒加载的单例Bean之后，才会调用每个单例bean的方法afterSingletonsInstantiated
	 */
	@Override
	public void afterSingletonsInstantiated() {

	}
}
