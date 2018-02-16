package org.wecancodeit.columbus.reviews;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReviewsController {

	@Resource
	ReviewRepository reviewRepo = new ReviewRepository();
	
	@RequestMapping("/reviews")
	public String getAllReviews(Model model) {
		model.addAttribute("reviews", reviewRepo.findAllReviews());
		return "reviews";
	}
	
	@RequestMapping("/review")
	public String getOneReview(@RequestParam Long reviewId, Model model) {
		model.addAttribute("review", reviewRepo.findReview(reviewId));
		return "review";
	}
	
}
