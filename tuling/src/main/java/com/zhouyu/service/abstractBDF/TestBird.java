package com.zhouyu.service.abstractBDF;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBird {

	public static void main(String[] args) {

		birdf();


	}

    public static void birdf() {
		// 创建一个Spring容器
		ClassPathXmlApplicationContext  xmlApplicationContext=new ClassPathXmlApplicationContext("spring.xml");
//		BirdChild birdChild = (BirdChild) xmlApplicationContext.getBean("birdChild");
		System.out.println((BirdChild) xmlApplicationContext.getBean("birdChild"));
		System.out.println((BirdChild) xmlApplicationContext.getBean("birdChild"));
		System.out.println((BirdChild) xmlApplicationContext.getBean("birdChild"));
        }

}







