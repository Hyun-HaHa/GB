package com.koreait.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.Getter;
import lombok.Setter;

@Entity
@SequenceGenerator(name = "MEMBER2_SEQ_GENERATOR",	// 이곳에서 사용하려고 이름 매핑
					sequenceName = "MEMBER_SEQ",	// DB와 매핑
					initialValue = 1, allocationSize = 1)
@Getter @Setter
public class Member2 {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, 
					generator = "MEMBER2_SEQ_GENERATOR")	
	private Long id;
	
	@Column(name="name", nullable = false)
	private String username;
	
}
