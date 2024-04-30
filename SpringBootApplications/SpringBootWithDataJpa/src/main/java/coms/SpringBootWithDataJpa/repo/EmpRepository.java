package coms.SpringBootWithDataJpa.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import coms.SpringBootWithDataJpa.models.Employee;

@Repository
public interface EmpRepository extends JpaRepository<Employee, Integer> {

	// JPQL Query
	
	@Query("select e from Employee e where e.job=:job")
	public List<Employee> ShowAllEmpsBasedOnJob(String job);
	
}
//@Query("select e from Employee  e where e.email =:email and e.pswd=:pwd")