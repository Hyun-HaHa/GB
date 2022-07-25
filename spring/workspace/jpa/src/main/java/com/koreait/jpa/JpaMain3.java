package com.koreait.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain3 {
	
	public static void main(String[] args) {
		
		// id, username에 임의의 데이터 insert 1건, table 생성
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		try {
			Member2 member2 = new Member2();
//			member2.setId("1");
			member2.setUsername("김자바");
			
			em.persist(member2);
			
			// 쿼리 실행 시점
			tx.commit();		
		} catch (Exception e) {
			tx.rollback();
		} finally {
			em.close();
			emf.close();
		}
		
		
		
	}

}
