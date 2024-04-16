package accio.com.example.taxiride.Repository;

import accio.com.example.taxiride.Models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {

}
