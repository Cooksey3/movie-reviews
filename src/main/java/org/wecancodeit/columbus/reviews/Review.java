package org.wecancodeit.columbus.reviews;

public class Review {

	private Long reviewId;
	private String movieName;
	private String movieSummary;
	private String reviewCategory;
	private String content;
	private String image;
	private String synopsis;
	private String director;

	public Review(Long reviewId, String movieName, String movieSummary, String reviewCategory, String content,
			String image, String synopsis, String director) {
		this.reviewId = reviewId;
		this.movieName = movieName;
		this.movieSummary = movieSummary;
		this.reviewCategory = reviewCategory;
		this.content = content;
		this.image = image;
		this.synopsis = synopsis;
		this.director = director;
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

	public String getSynopsis() {
		return synopsis;
	}

	public String getDirector() {
		return director;
	}
}
