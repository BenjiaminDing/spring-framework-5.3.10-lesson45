package com.zhouyu.service.lookup;

import com.zhouyu.conditionalanno.ZhouyuConditional;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

/**
 * 抽象类 接口不能注册成为一个Bean,
 * 但是--使用	@Lookup  就可以实现抽象类 也可以作为Bean被注册
 */
@Component
public abstract  class UserServiceLookUpDemo {
	@Lookup
	public void test(){
		System.out.println("userService---benjiamip");
	}

	public void test2(){
		System.out.println("userService---benjiamin--@Lookup");
	}


	public abstract void ss();


}
