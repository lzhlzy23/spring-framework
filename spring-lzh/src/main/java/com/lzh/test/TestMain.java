package com.lzh.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author cyrus.luo
 * @date 2022/1/26
 */

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(TestConfig.class);
		TestService bean = context.getBean(TestService.class);
		bean.hello();
	}
}
