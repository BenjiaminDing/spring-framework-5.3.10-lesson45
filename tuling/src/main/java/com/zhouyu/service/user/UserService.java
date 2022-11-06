package com.zhouyu.service.user;

import com.zhouyu.conditionalanno.ZhouyuConditional;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;


@Component("userService")
//@Conditional(ZhouyuConditional.class)// 这个注解对用类match返回的true--允许UserService成为一个Bean,反之不允许UserService成为Bean
public class UserService {

	public void test(){
		System.out.println("userService---benjiamin");
	}

	/**
	 * 涉及内部类的使用  ClassPathScanningCandidateComponentProvider.isCandidateComponent()
	 */
	class Member{

	}



}
