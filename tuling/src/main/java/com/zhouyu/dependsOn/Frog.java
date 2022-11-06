package com.zhouyu.dependsOn;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

/**
 * created     by benjiamin at 2022-11-03 / 12:54 /54
 * DependsOn的使用就是在创建Frog之前必须先创建fish--Bean,如果Fish没有使用@Component注解就会error
 *
 * 如果frog fish彼此都互相是使用DependsOn注解，就会出现循环依赖
 *
 */
@Component
@DependsOn("fish")
public class Frog {
	    public void test() {
			System.out.println("frog--bean");
	        }
}
