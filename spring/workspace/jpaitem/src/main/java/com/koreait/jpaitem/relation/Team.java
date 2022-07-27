package com.koreait.jpaitem.relation;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

//@Entity
@Getter @Setter
public class Team {
	
	@Id @GeneratedValue
	@Column(name = "TEAM_ID")
	private Long id;
	private String name;
	
	// ArrayList로 생성하는 것이 관례
	// mappedBy = "team" : Member.java의 tean과 mapping이 되어있다고 선언
	// @OneToMany	: Team에서 member로 가는건 1대 다이기 때문
	// team에 의해서 관리가 된다.
	// mappedBy가 적힌 곳은 읽기만 가능한다.
	@OneToMany(mappedBy = "team")
	private List<Member> member = new ArrayList<>();

	@Override
	public String toString() {
		return "Team [id=" + id + ", name=" + name + ", member=" + member + "]";
	}
	
	
}
