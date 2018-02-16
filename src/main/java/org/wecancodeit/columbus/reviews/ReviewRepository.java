package org.wecancodeit.columbus.reviews;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ReviewRepository {

	Map<Long, Review> reviews = new HashMap<>();
	
	public ReviewRepository(Review... reviews) {
		populateReviewMap(reviews);
	}
	
	public Review findReview(Long reviewId) {
		return reviews.get(reviewId);
	}
	
	
	public void populateReviewMap(Review... reviews) {
		for (Review review : reviews) {
			this.reviews.put(review.getReviewId(), review);
		}
	}

	public Collection<Review> findAllReviews() {
		return reviews.values();
	}

}