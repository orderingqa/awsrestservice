package com.openmarket.example.dao.jpa;

import com.openmarket.example.dao.ReviewDao;
import com.openmarket.example.domain.Review;
import com.openmarket.example.domain.User;

public class ReviewDaoImpl extends GenericDaoImpl<Review, Long> implements ReviewDao {
	// TODO 我可以覆写父类的create函数从而实现关联关系
    /** {@inheritDoc} */
    public Review create(Review domainObject) {
        if (logger.isDebugEnabled()) {
        	logger.debug("create called for Review DO: " + domainObject);
        	
        	logger.debug("id = " + domainObject.getId());
        	logger.debug("voice = " + domainObject.getVoiceUrl());
        	logger.debug("reviewer =" + domainObject.getReviewer());
        	if (domainObject.getReviewer() != null) {
        		logger.debug("user = " + domainObject.getReviewer().getId());
        		logger.debug("user password = " + domainObject.getReviewer().getPassword());
        	} else {
        		logger.debug("user of reviewer = null");
        	}
        	
//        	logger.debug("create called for domainObject: " + domainObject);
//            logger.debug("username = " + ((User)domainObject).getUsername());
//            logger.debug("password = " + ((User)domainObject).getPassword());
        }
try{

//	    User user = em.find(User.class, domainObject.getReviewer().getId());
//	    domainObject.setReviewer(user);
        em.persist(domainObject);}
catch (Exception e) {
	e.printStackTrace();
}
        return domainObject;
    }
}
