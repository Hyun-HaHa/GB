package com.koreait.jpaitem.domain;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
@Table(name = "ORDERS")
public class Order {
	
	@Id
	@GeneratedValue
	@Column(name = "ORDER_ID")
	private Long id;
	
	@Column(name = "MEMBER_ID")
	private Long memberId;
	
	private LocalDateTime orderDate;
	private String status;
	
}
