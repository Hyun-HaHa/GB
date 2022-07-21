package com.koreait.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
		EntityManager em = emf.createEntityManager();
		//Transaction : 데이터베이스의 상태를 변화시키기 위해 수행하는 작업 단위
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		try {
			// JPQL
			// JPA는 쿼리를 짤 때 Table을 대상으로 쿼리를 짜지 않고,
			// Member 객체를 통해서 쿼리를 짠다고 보면 된다.
			List<Member> result = em.createQuery("select m from Member as m", Member.class)
					.setFirstResult(5)	// 5번부터
					.setMaxResults(10)	// 10개를 가지고와 라는 뜻
					.getResultList();
			
			for(Member member : result) {
				System.out.println("member.name = " + member.getName());
			}
			
			// 회원조회
			/*							// 조회, pk값
			Member findMember = em.find(Member.class, 1L);
			System.out.println("id : " + findMember.getId());
			System.out.println("name : " + findMember.getName());
			*/
			
			// 회원 삭제
//			em.remove(findMember);
			
			// 회원 수정
//			findMember.setName("HelloJPAUser");
			
			// 회원 등록
			/*
			Member member = new Member();
			
			member.setId(4L);
			member.setName("UserD");
			
			// persist	: DB에 저장
			em.persist(member);
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
