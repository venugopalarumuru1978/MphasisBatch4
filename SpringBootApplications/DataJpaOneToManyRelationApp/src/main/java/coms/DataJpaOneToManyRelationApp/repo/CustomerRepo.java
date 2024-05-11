package coms.DataJpaOneToManyRelationApp.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import coms.DataJpaOneToManyRelationApp.entities.CusResponse;
import coms.DataJpaOneToManyRelationApp.entities.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {
	
	@Query("select new coms.DataJpaOneToManyRelationApp.entities.CusResponse(c.custname, p.prdname) from Customer c join c.prds p")
	public List<CusResponse> getCustomerProductInfo();

	@Query("select new coms.DataJpaOneToManyRelationApp.entities.CusResponse(c.custname, p.prdname) from Customer c join c.prds p where p.prdid=:pid")
	public CusResponse getCustomerProductInfoBasedOnPrdId(int pid);

}
