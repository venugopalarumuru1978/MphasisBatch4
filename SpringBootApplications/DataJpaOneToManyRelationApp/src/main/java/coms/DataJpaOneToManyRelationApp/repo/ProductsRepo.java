package coms.DataJpaOneToManyRelationApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import coms.DataJpaOneToManyRelationApp.entities.Products;

@Repository
public interface ProductsRepo extends JpaRepository<Products, Integer> {

}
