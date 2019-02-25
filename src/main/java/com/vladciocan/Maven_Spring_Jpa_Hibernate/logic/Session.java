package com.vladciocan.Maven_Spring_Jpa_Hibernate.logic;

import java.io.Serializable;
import java.sql.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sessions")
public class Session implements Serializable{

	private static final long serialVersionUID = 7883019972509122155L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "session_id", unique = true, nullable = false)
	private long sessionId;
	
	@Column(name = "timestamp", unique = false, nullable = false)
	private Date timestamp;
	
	@Column(name = "session_uid", nullable = false, unique = true, length = 50)
	private String session_uid;
	
	@Column(name = "user_id", nullable = false)
	private long userId;
	
	@Column(name = "tip", nullable = false)
	private long tip;
	

	public long getSessionId() {
		return sessionId;
	}

	public void setSessionId(long sessionId) {
		this.sessionId = sessionId;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getSession() {
		return session_uid;
	}

	public void setSession(String session) {
		this.session_uid = session;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}


	public long getTip() {
		return tip;
	}

	public void setTip(long tip) {
		this.tip = tip;
	}

	public Session(long sessionId,  long userId,long tip) {
		super();
		this.tip=tip;
		this.sessionId = sessionId;
		this.userId = userId;
		UUID uuid = UUID.randomUUID();
		this.session_uid = uuid.toString();
		this.timestamp = new java.sql.Date(new java.util.Date().getTime());
	}

	public Session() {
		super();
		UUID uuid = UUID.randomUUID();
		this.session_uid = uuid.toString();
		this.timestamp = new java.sql.Date(new java.util.Date().getTime());
	}
	public Session(long id) {
		super();
		this.userId = id;
		UUID uuid = UUID.randomUUID();
		this.session_uid = uuid.toString();
		this.timestamp = new java.sql.Date(new java.util.Date().getTime());
	}
	public Session(long id,long tip) {
		super();
		this.tip=tip;
		this.userId = id;
		UUID uuid = UUID.randomUUID();
		this.session_uid = uuid.toString();
		this.timestamp = new java.sql.Date(new java.util.Date().getTime());
	}
	
}
