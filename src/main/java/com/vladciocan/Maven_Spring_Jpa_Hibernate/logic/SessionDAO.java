package com.vladciocan.Maven_Spring_Jpa_Hibernate.logic;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;



@Repository
@Transactional
public class SessionDAO {
	@PersistenceContext	
	private EntityManager entityManager;
	
	public void save(Session newSession) {
		entityManager.persist(newSession);
		
	}
	public Session getByID(long id) {
		return (Session) entityManager.find(Session.class, id);
	}
	@SuppressWarnings("unchecked")
	public ArrayList<Session> getAll(){
		return (ArrayList<Session>) entityManager.createQuery("Select s from Session s").getResultList();
	}
	public void delByID(long id) {
		Session s=entityManager.find(Session.class, id);
		entityManager.remove(s);
	}
	public void updateSession(Session modifiedSession) {
		entityManager.merge(modifiedSession);
	}
	
}
