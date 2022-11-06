package com.zhouyu.service.lookup;

import com.zhouyu.service.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

/**
 * 抽象类 接口不能注册成为一个Bean,
 * 但是--使用	@Lookup  就可以实现抽象类 也可以作为Bean被注册
 */
@Component
public   class UserServiceLookUpDemo2 {

//	@Autowired
//	private Car  car; // 使用的是原形

	public void med1() {
		System.out.println("car》》::"+getCar());
	}

	@Lookup
	public Car getCar() {

		return    null;
	}




}
