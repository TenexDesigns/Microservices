package com.tenex.reviewservice.controller;

import com.tenex.reviewservice.model.ReviewModel;
import com.tenex.reviewservice.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;




@RestController
@RequestMapping("/reviews")
public class ReviewController  {

    @Autowired
    private ReviewService reviewService;


//    @GetMapping("/for-book/{bookId}")
//    public ResponseEntity<Optional<ReviewModel>> getReviewsForBook(@PathVariable String bookId) {
//        return null;
//    }
//
//    public List<ReviewModel> getReviewsForBook(String bookId) {
//        List<ReviewModel> reviews=  reviewService.findByBookId(bookId);
//        return ResponseEntity.ok(reviews).getBody();
//    }



        @PostMapping
        public ResponseEntity<ReviewModel> createReview(@RequestBody ReviewModel review) {
            ReviewModel createdReview = reviewService.createReview(review);
            return ResponseEntity.status(HttpStatus.CREATED).body(createdReview);
        }

        @GetMapping("/for-book/{bookId}")
        public ResponseEntity<Optional<List<ReviewModel>>> getReviewsForBook(@PathVariable String bookId) {
            Optional<List<ReviewModel>> reviews = reviewService.findByBookId(bookId);
            return ResponseEntity.ok(reviews);
        }

        @GetMapping("/books/{bookId}/average-rating")
        public ResponseEntity<Double> getAverageRatingForBook(@PathVariable String bookId) {
            Double averageRating = reviewService.getAverageRatingForBook(bookId);
            return ResponseEntity.ok(averageRating);
        }

        // Other methods (update and delete) remain unchanged










//    @PostMapping
//    public ResponseEntity<ReviewModel> createBook(@RequestBody ReviewModel review) {
//        ReviewModel createdReview = reviewService.createReview(review);
//        return ResponseEntity.status(HttpStatus.CREATED).body(createdReview);
//    }

//    @GetMapping
//    public ResponseEntity<List<ReviewModel>> getAllBooks() {
//        List<ReviewModel> books = reviewService.getAllReviews();
//        return ResponseEntity.ok(books);
//    }

    @GetMapping("/{reviewId}")
    public ResponseEntity<Optional<ReviewModel>> getBookById(@PathVariable String reviewId) {
        Optional<ReviewModel> book = reviewService.getReviewById(reviewId);
        if (book.isPresent()) {
            return ResponseEntity.ok(book);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{bookId}")
    public ResponseEntity<Optional<ReviewModel>> updateBook(@PathVariable String reviewId, @RequestBody ReviewModel updatedReview) {
        Optional<ReviewModel> reviewOptional = reviewService.updateReview(reviewId, updatedReview);
        if (reviewOptional.isPresent()) {
            return ResponseEntity.ok(reviewOptional);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{reviewId}")
    public ResponseEntity<Void> deleteBook(@PathVariable String reviewId) {
        reviewService.deleteBook(reviewId);
        return ResponseEntity.noContent().build();
    }



}


