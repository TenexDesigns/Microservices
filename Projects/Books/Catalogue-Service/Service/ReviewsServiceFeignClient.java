
@FeignClient(name = "reviews-service")
public interface ReviewsServiceFeignClient {

    @GetMapping("/reviews/for-book/{bookId}")
    ResponseEntity<List<ReviewModel>> getReviewsForBook(@PathVariable String bookId);

    // Other methods for communication
}
