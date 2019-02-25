package com.vladciocan.Maven_Spring_Jpa_Hibernate.logic;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SessionService {
	@Autowired
	private SessionDAO sd;
	
	public String createNewSession(long userId,long tip) {
		Session newSession = new Session(userId,tip);
		sd.save(newSession);
		return newSession.getSession();
	}
	public ArrayList<Session> getAll(){
		return sd.getAll();
	}
	public void delSession(long id) {
		sd.delByID(id);
	}
	public void updateSession(Session s) {
		sd.updateSession(s);
	}
	public Session get(long id) {
		return sd.getByID(id);
	}
	
}

