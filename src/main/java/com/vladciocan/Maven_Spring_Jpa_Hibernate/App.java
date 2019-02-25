package com.vladciocan.Maven_Spring_Jpa_Hibernate;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.vladciocan.Maven_Spring_Jpa_Hibernate.config.WebConfig;



/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App   extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { WebConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
	    return null;
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}
	

}