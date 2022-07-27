package com.koreait.jpaitem.embed;

import java.time.LocalDateTime;

import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Embeddable
public class Period {
	
	private LocalDateTime startDate;
	private LocalDateTime endDate;
	
	// 테스트를 위한 파라미터있는 생성자
	public Period(LocalDateTime startDate, LocalDateTime endDate) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	// 기본생성자는 반드시 있어야 한다.
	public Period() {}
	
	
	
}
