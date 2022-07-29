package com.koreait.jpaTest.relation;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Orders {
	
	@Id 
	@GeneratedValue
	@Column(name = "ORDER_ID")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "MEMBER_ID")
	private Member member;
	
	private LocalDateTime orderDate;
	private String status;
	
	@Override
	public String toString() {
		return "Orders [id=" + id 
							+ ", orderDate=" + orderDate 
							+ ", status=" + status + "]";
	}

	public void changeMember(Member member) {
		this.member = member;
		member.getOrders().add(this);
	}
	
	
	
}
