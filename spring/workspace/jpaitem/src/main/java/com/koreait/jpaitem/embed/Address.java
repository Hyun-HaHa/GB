package com.koreait.jpaitem.embed;

import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Embeddable
public class Address {
	
	private String city;
	private String street;
	private String zipcode;
	
	// 테스트를 위한 파라미터있는 생성자
	public Address(String city, String street, String zipcode) {
		super();
		this.city = city;
		this.street = street;
		this.zipcode = zipcode;
	}
	
	// 기본생성자는 반드시 있어야 한다.
	public Address() {}

	
}
