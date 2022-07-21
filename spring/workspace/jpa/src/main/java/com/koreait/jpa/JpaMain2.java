package com.koreait.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain2 {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");		// 설정파일을 읽어오기 위한 역할
		EntityManager em = emf.createEntityManager();									
		//Transaction : 데이터베이스의 상태를 변화시키기 위해 수행하는 작업 단위
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		try {
			Member member = new Member();
			member.setId(100L);
			member.setName("JPA1");		// 여기까지 비영속상태 (JPA랑 전혀 무방한 객체)
			
			// 여기서 부터 영속상태, 영속성 컨텍스트 공간에 member라는 객체를 영속성상태로 만들어놓음.
			// EntityManager안에 있는 영속 컨텍스트에 관리가 된다는 뜻
			// 아직 DB에는 저장이 안된 상태
			// 만약 em.persist(member); 여기에서 DB쿼리가 실행된다면,
			// 출력문 사이에 DB쿼리가 실행이 되어야 한다.
			System.out.println("======= before ========");
			em.persist(member);			
			System.out.println("======= after ========");
			
			
			
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
