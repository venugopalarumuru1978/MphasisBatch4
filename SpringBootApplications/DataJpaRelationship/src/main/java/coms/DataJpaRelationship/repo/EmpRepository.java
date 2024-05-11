package coms.DataJpaRelationship.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import coms.DataJpaRelationship.entities.Employee;

@Repository
public interface EmpRepository extends JpaRepository<Employee, Integer> {

}
