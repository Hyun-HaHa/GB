package com.koreait.jpaTest.relation;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class JpaMain {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		try {
			Member member = new Member();
			member.setName("member");
			member.setAddress(new Address("서울", "거꾸로해도 역삼역", "123"));
			em.persist(member);
			
			
			for(int i = 0; i < 10; i++) {
				Orders orders = new Orders();
				orders.setOrderDate(LocalDateTime.now());
				orders.setStatus("접수" + i);
				orders.changeMember(member);
				em.persist(orders);
			}
			
			em.flush();
			em.clear();
			
			Member findMember = em.find(Member.class, member.getId());
			
			List<Orders> orders = findMember.getOrders();
			
			System.out.println("Member = " + orders.get(0).getMember().toString());
			
			for (Orders m : orders) {
				System.out.println("Order = " + m.toString());
			}
			
			tx.commit();		
		} catch (Exception e) {
			tx.rollback();
		} finally {
			em.close();
			emf.close();
		}
		
	}

}
