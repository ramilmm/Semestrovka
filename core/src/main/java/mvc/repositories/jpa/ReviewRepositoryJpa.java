package mvc.repositories.jpa;

import mvc.common.ReviewInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/*
* Acces to database
* SQL query
* Using JPA
* */
public interface ReviewRepositoryJpa extends JpaRepository<ReviewInfo, Long> {

    ReviewInfo findById(Long id);

    ReviewInfo findByGood_Id(Long id);

    ReviewInfo findByUser_Id(Long id);
}
