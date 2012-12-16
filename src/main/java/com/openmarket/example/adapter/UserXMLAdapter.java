package com.openmarket.example.adapter;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.xml.bind.annotation.adapters.XmlAdapter;

import org.apache.log4j.Logger;

import com.openmarket.example.domain.User;

public class UserXMLAdapter extends XmlAdapter<Long, User> {
	protected final Logger logger = Logger.getLogger(getClass());
	
	@PersistenceContext
    protected EntityManager em;
	
	@Override
	public Long marshal(User arg0) throws Exception {
		return arg0.getId();
	}

	@Override
	public User unmarshal(Long arg0) throws Exception {
		User u = null;
		if (logger.isDebugEnabled()) {
		    logger.debug("user id is : " + arg0);
		    try {
		        u = em.find(User.class, arg0);
		    	logger.debug("user from em is : " + u);
		    } catch (Exception e) {
		    	logger.debug(e.toString());
		    }
		}
		return u;
	}

}
