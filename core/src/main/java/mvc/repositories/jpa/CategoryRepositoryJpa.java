package mvc.repositories.jpa;

import mvc.common.CategoryInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/*
* Access to database
* SQL query
* Using JPA
* */
public interface CategoryRepositoryJpa extends JpaRepository<CategoryInfo, Long> {


    CategoryInfo findById(Long id);

    CategoryInfo findByName(String name);

    List<CategoryInfo> findByParent_Id(Long id);

}
