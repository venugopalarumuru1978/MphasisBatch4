package coms.RestAPIDataJpaApp.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import coms.RestAPIDataJpaApp.entities.AdminInfo;

@Repository
public interface AdminRepo extends JpaRepository<AdminInfo, Integer> {

}
