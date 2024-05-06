package coms.EmpServiceProiverApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import coms.EmpServiceProiverApp.entities.Employee;

@Repository
public interface EmpRepository extends JpaRepository<Employee, Integer> {

}
