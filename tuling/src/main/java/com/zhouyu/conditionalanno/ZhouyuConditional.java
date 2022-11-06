package com.zhouyu.conditionalanno;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;


/**
 * created     by benjiamin at 2022-10-29 / 10:13 /13
 * @实现一个接口重写一个方法，在方法体里面编写一个判断条件，返回blooean值
 */
public class ZhouyuConditional implements Condition {

	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {

		try {
			// 模拟一个判断条件如果存在User.class Bean就返回true
			context.getClassLoader().loadClass("com.zhouyu.service.user.User");
			return true;
		} catch (ClassNotFoundException e) {
			return false;
		}

	}
}
