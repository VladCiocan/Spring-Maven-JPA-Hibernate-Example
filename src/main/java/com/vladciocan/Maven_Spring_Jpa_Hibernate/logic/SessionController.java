package com.vladciocan.Maven_Spring_Jpa_Hibernate.logic;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/login")
@PropertySource("classpath:application.properties")
public class SessionController {
	
	@Autowired 
	private SessionService sessionsService;
	
	
	@CrossOrigin(origins = "*")
	@PostMapping(value = "/update")
	public void update(@RequestBody Session s) {
		sessionsService.updateSession(s);
	}
	
	@CrossOrigin(origins = "*")
	@PostMapping(value = "/getAll")
	public ArrayList<Session> getAll() {
		return sessionsService.getAll();
	}
	
	@CrossOrigin(origins = "*")
	@PostMapping(value = "/getOne")
	public Session getOne(@RequestParam(name="id") long id) {
		return sessionsService.get(id);
	}
	
	
	
}
