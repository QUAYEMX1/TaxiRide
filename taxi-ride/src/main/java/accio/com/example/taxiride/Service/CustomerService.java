package accio.com.example.taxiride.Service;

import accio.com.example.taxiride.Models.Customer;
import accio.com.example.taxiride.Repository.CustomerRepository;
import accio.com.example.taxiride.Request.CustomerRequest;
import accio.com.example.taxiride.Response.CustomerResponse;
import accio.com.example.taxiride.transformer.CustomerTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

  private final CustomerRepository customerRepository;

  CustomerService(CustomerRepository customerRepository){this.customerRepository=customerRepository;
  }

//  @Autowired
//  private CustomerTransformer customerTransformer;
  public CustomerResponse addCustomer(CustomerRequest customerRequest){
    CustomerTransformer customerTransformer=new CustomerTransformer();

    Customer customer=customerTransformer.customerRequestToCustomer(customerRequest);

    Customer savedCustomer=customerRepository.save(customer);

    CustomerResponse response1=customerTransformer.customerToCustomerResponse(customer);

    return response1;
  }
}
