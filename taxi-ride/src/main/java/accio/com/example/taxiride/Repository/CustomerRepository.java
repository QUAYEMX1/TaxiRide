package accio.com.example.taxiride.Repository;

import accio.com.example.taxiride.Enums.Gender;
import accio.com.example.taxiride.Models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {


    @Query(value = "select c from Customer c where c.gender = :g and c.age >= :age")
    List<Customer> getByGenderAndAgeGreaterThan(Gender g, int age);

//    List<Customer> findByGenderAndAgeGreaterthan(Gender gender,int age);
}
