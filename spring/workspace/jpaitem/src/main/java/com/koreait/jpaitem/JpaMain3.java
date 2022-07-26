package com.koreait.jpaitem;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.koreait.jpaitem.relation.Member;
import com.koreait.jpaitem.relation.Team;


public class JpaMain3 {
public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		try {
			/*
			Member member = new Member();
			member.setName("member1");
			em.persist(member);
				
			Team team = new Team();
			team.setName("TeamA");
			team.getMember().add(member);
			em.persist(team);
			*/
			
			Team team = new Team();
			team.setName("TeamA");
			em.persist(team);
			
			Member member = new Member();
			member.setName("member1");
			member.changeTeam(team);	// 연관관계의 주인에게 값을 설정
			em.persist(member);
			
			
			// 강제로 DB쿼리를 보고 싶을 때
//			em.flush();
//			em.clear();
			
			/*
			 * flush, clear를 주석처리 했을 때
			 * 결과 : insert문만 실행, select문은 실행되지 않는다.
			 * 이유 : team이 영속성 컨텍스트에 들어가 있는데 (1차 캐시),
			 * 		 현재 변경된 것을 감지하지 못한 상태
			 * 		 (flush가 호출되지 않은 상태)에서 검색을 하니 select가		
			 * 		 되지 않는 것
			 * 		즉, 1차 캐시에서 담긴 내용이 그대로 조회된다.
			 */
			
			// 영속성 컨텍스트 영역안에 insert 될 예정의 member 객체 내용이 채워지기 때문에 결과값을 확인할 수 있다.
//			team.getMember().add(member);		-> Member클래스의 setTeam안에 로직을 추가(해당 로직을 setter에다가 넣어준다.)
			
			
			System.out.println("==============================================");
			
			Team findTeam = em.find(Team.class, team.getId());
			List<Member> members = findTeam.getMember();
			
			// StackOverFlowError	
//			System.out.println("member = " + findTeam);		//findTeam 자체가 toString()을 불러온다.
			
			for(Member m : members) {
				System.out.println("m = " + m.getName());
			}
			
			System.out.println("==============================================");
			
			tx.commit();		
		} catch (Exception e) {
			tx.rollback();
		} finally {
			em.close();
			emf.close();
		}
		
		
		
	}
}
