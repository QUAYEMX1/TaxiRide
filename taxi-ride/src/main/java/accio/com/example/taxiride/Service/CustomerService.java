package accio.com.example.taxiride.Service;

import accio.com.example.taxiride.Enums.Gender;
import accio.com.example.taxiride.Models.Customer;
import accio.com.example.taxiride.Repository.CustomerRepository;
import accio.com.example.taxiride.dto.Request.CustomerRequest;
import accio.com.example.taxiride.dto.Response.CustomerResponse;
import accio.com.example.taxiride.transformer.CustomerTransformer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

  private final CustomerRepository customerRepository;

  CustomerService(CustomerRepository customerRepository){this.customerRepository=customerRepository;
  }

//  @Autowired
//  private CustomerTransformer customerTransformer;

  CustomerTransformer customerTransformer=new CustomerTransformer();
  public CustomerResponse addCustomer(CustomerRequest customerRequest){

    Customer customer=customerTransformer.customerRequestToCustomer(customerRequest);

    Customer savedCustomer=customerRepository.save(customer);

    CustomerResponse response1=customerTransformer.customerToCustomerResponse(customer);

    return response1;
  }


  public List<CustomerResponse> getCustomerAgeandGender(Gender gender,int age){
        List<Customer>customerList=customerRepository.getByGenderAndAgeGreaterThan(gender,age);

        List<CustomerResponse>responseList=new ArrayList<>();

        for(Customer customer:customerList){

          responseList.add(customerTransformer.customerToCustomerResponse(customer));
        }

        return responseList;
  }
}
