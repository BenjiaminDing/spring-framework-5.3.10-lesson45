package com.zhouyu.construct;

import org.springframework.context.annotation.Scope;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * created     by benjiamin at 2022-11-02 / 23:35 /35
 */
@Component
//@Scope(value = "prototype")
public class WrapperService {

	private OrderService  orderService;

	public WrapperService(OrderService orderService) {
		System.out.println("All Construct  index=1");
		this.orderService = orderService;
	}

	public WrapperService() {

		System.out.println("NO Construct  index=0");
	}

	    public void test() {
			System.out.println("执行test");
	        }
}
