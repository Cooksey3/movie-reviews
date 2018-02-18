package org.wecancodeit.columbus.reviews;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepository {

	Map<Long, Review> reviews = new HashMap<>();

	public ReviewRepository() {
		Review firstMovie = new Review(902L, "Identity", "Great thiller. Excellent ending.", "Thriller",
				"Great plot. Excellent twists.", "/images/identity.jpg",
				"A group of strangers are stranded in an isolated town, as they slowly die off...", "James Mangold");
		Review secondMovie = new Review(121L, "John Wick", "Great action movie.", "Action", "Basic plot. Great action.",
				"/images/john-wick.jpg", "After the brutal murder of Wick's dog, Wick goes on a hunt to get revenge.",
				"Chad Stahelski, David Leitch");
		Review thirdMovie = new Review(432L, "Texas Chainsaw Massacre", "Strange movie...worth a watch, but not more.",
				"Horror", "Decent plot. Some gore. Odd ending that dragged on too long.",
				"/images/texas-chainsaw-massacre.jpg",
				"A group of friends is assaulted by a chainsaw-wielding murderer", "Tobe Hooper");
		Review fourthMovie = new Review(223L, "Silence of the Lambs", "Mystery thriller with great acting. A+ movie.",
				"Thriller", "Lots of thrills. Great acting by Hopkins and supporting cast.",
				"/images/silence-of-the-lambs.jpg",
				"Top FBI prospect Clarice Starling attempts to track down the deranged Buffalo Bill, but must enlist the help of the psycopathic Dr. Hannibal Lecter.",
				"Jonathan Demme");
		Review fifthMovie = new Review(400L, "Cube", "Interesting concept. Moderate acting.", "Thriller",
				"Lots of tension. Relational drama throughout.", "/images/cube.jpg",
				"A group of prisoners find themselves trapped in a large, "
						+ "menacing cube and must work together to escape. Will they ever solve the cube?",
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