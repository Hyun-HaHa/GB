package com.koreait.thymeleaf.bean;

import org.springframework.stereotype.Component;

// 스프링 컨테이너에 싱글톤으로 빈이 등록된다.
@Component("helloBean")
public class HelloBean {
	
	public String hello(String data) {
		return "Bean " + data;
	}
	
	
	
}
