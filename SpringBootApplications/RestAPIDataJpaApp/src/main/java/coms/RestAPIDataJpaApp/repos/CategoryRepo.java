package coms.RestAPIDataJpaApp.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import coms.RestAPIDataJpaApp.entities.Category;

@Repository
public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
