package com.koreait.jpaitem;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.koreait.jpaitem.relation.Member;
import com.koreait.jpaitem.relation.Team;

public class JpaMain2 {
public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		try {
			Team team = new Team();
			team.setName("TeamA");
			em.persist(team);
			
			Member member = new Member();
			member.setName("member1");
			member.setTeam(team);		// insert시에 fk값으로 사용한다.
			em.persist(member);
			
			// select
			// 어느팀 소속인지 알고싶을 때
			/*
			Member findMember = em.find(Member.class, member.getId());
			Long findTeamId = findMember.getTeamId();
			Team findTeam = em.find(Team.class, findTeamId);
			System.out.println("findTeam : " + findTeam.getName());
			*/
			
			// 강제로 DB쿼리를 보고 싶을 때
			em.flush();
			em.clear();
			
			/*
			// select
			// find시에 1차캐시에서 가지고 와서 select문이 있다.
			Member findMember = em.find(Member.class, member.getId());
			Team findTeam = findMember.getTeam();
			System.out.println("findTeamName : " + findTeam.getName());
			
			// 양방향 매핑
			Member findSideMember = em.find(Member.class, member.getId());		// Member.class에서 member.getId()넘겨서 객체를 받아왔다.
			List<Member> members = findSideMember.getTeam().getMember();		// findSideMember에 있는 팀에 속해있는 멤버를 담아왔다.
			
			for(Member m : members) {
				System.out.println("result = " + m.getName());
			}
			*/
			
			tx.commit();		
		} catch (Exception e) {
			tx.rollback();
		} finally {
			em.close();
			emf.close();
		}
		
		
		
	}
}
