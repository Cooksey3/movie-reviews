package org.wecancodeit.columbus.reviews;


public class Review {

	private Long reviewId;
	private String movieName;
	private String movieSummary;
	
	public Review(Long reviewId, String movieName, String movieSummary) {
		this.reviewId = reviewId;
		this.movieName = movieName;
		this.movieSummary = movieSummary;
	}

	public Long getReviewId() {
		return reviewId;
	}
	
	public String getMovieName() {
		return movieName;
	}
	
	public String getMovieSummary() {
		return movieSummary;
	}

}
