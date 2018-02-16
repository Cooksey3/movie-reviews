package org.wecancodeit.columbus.reviews;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Test;

public class ReviewsRepositoryTest {

	private ReviewRepository underTest;
	
	private long firstReviewId = 100L;
	private Review firstReview = new Review(firstReviewId, "First Review", "Description of Movie");

	private long secondReviewId = 143L;
	private Review secondReview = new Review(secondReviewId, "Second Review", "Description of Second Movie");

	@Test
	public void shouldFindFirstReview() {
		underTest = new ReviewRepository(firstReview);
		
		Review check = underTest.findReview(firstReviewId);
		
		assertThat(check, is(firstReview));
	}
	
	@Test
	public void shouldFindSecondReview() {
		underTest = new ReviewRepository(firstReview, secondReview);
		
		Review check = underTest.findReview(secondReviewId);
		
		assertThat(check, is(secondReview));
	}
	
	@Test
	public void shouldFindAllReviews() {
		underTest = new ReviewRepository(firstReview, secondReview);
		
		Collection<Review> check = underTest.findAllReviews();
		
		assertThat(check, containsInAnyOrder(firstReview, secondReview));
	}
}