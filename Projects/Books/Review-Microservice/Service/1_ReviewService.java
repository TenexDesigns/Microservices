package com.tenex.reviewservice.service;

import com.tenex.reviewservice.model.ReviewModel;
import com.tenex.reviewservice.repository.ReviewRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;


@Service
@Slf4j
public class ReviewService {



        @Autowired
        private ReviewRepository reviewRepository;

        // Existing methods (getAll, createReview, getAllReviews, getReviewById, updateReview, deleteReview) remain unchanged

        public Optional<ReviewModel> getReviewsForBook(String bookId) {
            return reviewRepository.findById(Long.valueOf(bookId));
        }

        public double getAverageRatingForBook(String bookId) {
            Optional<ReviewModel> review = reviewRepository.findById(Long.valueOf(bookId));

            if (review.isEmpty()) {
                return 0.0;  // Return 0 if no reviews are found
            }

            var reviews = review.get();



            return 4.4;
        }





    public List<ReviewModel> getAll(){

        return reviewRepository.findAll();


    }

    public ReviewModel createReview(ReviewModel review) {

        return reviewRepository.save(review);


    }

    public List<ReviewModel> getAllReviews() {

        return reviewRepository.findAll();
    }

    public Optional<ReviewModel> getReviewById(String reviewId) {
        return  reviewRepository.findById(Long.valueOf(reviewId));
    }

    public Optional<ReviewModel> updateReview(String reviewId, ReviewModel updatedReview) {

        Optional<ReviewModel> optionalReview = reviewRepository.findById(Long.valueOf(reviewId));

        if (optionalReview.isPresent()) {
            ReviewModel review = optionalReview.get();
            if (updatedReview.getReview() != null) {
                review.setReview(updatedReview.getReview());
            }
            if (updatedReview.getRating()!= null) {
                review.setRating(updatedReview.getRating());
            }
            if (updatedReview.getBookId() != null) {
                review.setBookId(updatedReview.getBookId());
            }

            return Optional.of(reviewRepository.save(review));
        }else {
            return Optional.empty();
        }
    }

    public void deleteBook(String reviewId) {


        Optional<ReviewModel> employee = reviewRepository.findById(Long.valueOf(reviewId));
        if (employee.isPresent()) {
            reviewRepository.deleteById(Long.valueOf(reviewId));
            ResponseEntity.ok("Employee of id " +reviewId+ " has been deleted");


        }
        //How do I trwo error in spring boot , in what scenarios do I throw errors and how , using what

    }

    public Optional<List<ReviewModel>> findByBookId(String bookId) {
            return Optional.ofNullable(reviewRepository.findByBookId(bookId));
    }
}


