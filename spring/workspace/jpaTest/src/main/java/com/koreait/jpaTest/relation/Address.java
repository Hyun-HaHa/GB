package com.koreait.jpaTest.relation;

import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Embeddable
public class Address {
	
	private String city;
	private String street;
	private String zipcode;
	
	public Address() {}

	public Address(String city, String street, String zipcode) {
		super();
		this.city = city;
		this.street = street;
		this.zipcode = zipcode;
	}

	@Override
	public String toString() {
		return "Address [city=" + city 
				+ ", street=" + street 
				+ ", zipcode=" + zipcode + "]";
	}
	
	
	
}
