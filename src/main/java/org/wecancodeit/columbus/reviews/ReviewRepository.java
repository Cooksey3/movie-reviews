package org.wecancodeit.columbus.reviews;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepository {

	Map<Long, Review> reviews = new HashMap<>();

	public ReviewRepository() {
		Review firstMovie = new Review(902L, "Identity", "Great thiller. Excellent ending.", "Review Category",
				"Content", "/images/identity.jpg", "Synopsis", "James Mangold");
		Review secondMovie = new Review(121L, "John Wick", "Best. Movie. Ever.", "Review Category", "Content",
				"/images/john-wick.jpg", "Synopsis", "Chad Stahelski, David Leitch");
		Review thirdMovie = new Review(432L, "Texas Chainsaw Massacre", "Strange ending...needs reworking.",
				"Review Category", "Content", "/images/texas-chainsaw-massacre.jpg", "Synopsis", "Tobe Hooper");
		Review fourthMovie = new Review(223L, "Silence of the Lambs", "Movie description", "Review Category", "Content",
				"/images/silence-of-the-lambs.jpg", "Synopsis", "Jonathan Demme");
		Review fifthMovie = new Review(400L, "Cube", "Movie description", "Review Category", "Content",
				"/images/cube.jpg",
				"A group of prisoners find themselves trapped in a large, "
						+ "menacing cube and must work together to escape. Will they ever solve the cube out?",
				"Vincenzo Natali");

		populateReviewMap(firstMovie, secondMovie, thirdMovie, fourthMovie, fifthMovie);
	}

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