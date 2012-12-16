package com.openmarket.example.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.springframework.stereotype.Component;

import com.openmarket.example.domain.Review;
import com.openmarket.example.domain.service.ReviewService;
import com.openmarket.example.management.Monitored;
import com.sun.jersey.api.spring.Autowire;
import com.sun.jersey.spi.resource.Singleton;


@Singleton
@Path("/reviews")
@Component
@Autowire
public class ReviewsResource {
    
	private ReviewService reviewService;
	
    @GET
    @Monitored("Reviews Read All")
    public List<Review> readAll() {
        return reviewService.findAll();
    }

    public void setReviewService(ReviewService reviewService) {
        this.reviewService = reviewService;
    }
}
