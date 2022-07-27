package com.koreait.jpaitem.embed;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Member {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name = "name", nullable = false)
	private String username;
	
	// 기간
	// 값을 사용하는 쪽에 embedded정의
	// @Embedded과 @Embeddable 둘중에 하나만 넣어도 되나,
	// 둘 다 넣는것을 권장
	@Embedded	
	private Period period;
//	private LocalDateTime startDate;
//	private LocalDateTime endDate;
	
	// 주소
	@Embedded
	private Address address;
//	private String city;
//	private String street;
//	private String zipcode;
	
	// 회사주소
	// Address클래스 단위로 추가하고 싶을 때 사용
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(column = @Column(name = "WORK_CITY"), name = "city"),
		@AttributeOverride(column = @Column(name = "WORK_STREET"), name = "street"),
		@AttributeOverride(column = @Column(name = "WORK_ZIPCODE"), name = "zipcode")
	})
	private Address workAddress;
	
	
	
	
}
