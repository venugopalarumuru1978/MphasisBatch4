package coms.RestAPIDataJpaApp.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import coms.RestAPIDataJpaApp.entities.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {

}
