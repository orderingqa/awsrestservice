package com.openmarket.example.domain.service;

import com.openmarket.example.dao.ReviewDao;
import com.openmarket.example.domain.Review;

public class ReviewServiceImpl 
        extends GenericDomainObjectServiceImpl<ReviewDao, Review, Long> 
        implements ReviewService {

}