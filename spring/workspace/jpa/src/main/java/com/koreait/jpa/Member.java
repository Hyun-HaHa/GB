package com.koreait.jpa;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

// @Entity	: JPA가 관리할 객체
@Entity
@Getter @Setter
public class Member {
	
	// @Id	: 데이터베이스 PK와 매핑
	@Id
	private Long id;
	private String name;
	
	
}
