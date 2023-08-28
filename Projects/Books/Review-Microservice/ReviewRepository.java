import com.tenex.reviewservice.model.ReviewModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ReviewRepository extends JpaRepository<ReviewModel, Long> {

    List<ReviewModel> findByBookId(String bookId);
}


