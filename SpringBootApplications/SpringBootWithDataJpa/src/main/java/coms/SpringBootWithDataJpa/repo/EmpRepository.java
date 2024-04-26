package coms.SpringBootWithDataJpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import coms.SpringBootWithDataJpa.models.Employee;

@Repository
public interface EmpRepository extends JpaRepository<Employee, Integer> {

	
}
