package coms.RestAPIDataJpaApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import coms.RestAPIDataJpaApp.models.CricInfo;

@Repository
public interface CrickRepo extends JpaRepository<CricInfo, Integer> {

}


