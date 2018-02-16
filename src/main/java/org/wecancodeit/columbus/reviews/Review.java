package org.wecancodeit.columbus.reviews;

public class Review {

	private Long reviewId;
	private String movieName;
	private String movieSummary;
	private String reviewCategory;
	private String content;
	private String image;
	
	public Review(Long reviewId, String movieName, String movieSummary, String reviewCategory, String content, String image) {
		this.reviewId = reviewId;
		this.movieName = movieName;
		this.movieSummary = movieSummary;
		this.reviewCategory = reviewCategory;
		this.content = content;
		this.image = image;
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
	
	public String getReviewCategory() {
		return reviewCategory;
	}
	
	public String getContent() {
		return content;
	}
	
	public String getImage() {
		return image;
	}
}
