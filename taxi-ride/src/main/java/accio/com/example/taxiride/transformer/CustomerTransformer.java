package accio.com.example.taxiride.transformer;

import accio.com.example.taxiride.Models.Customer;
import accio.com.example.taxiride.Request.CustomerRequest;
import accio.com.example.taxiride.Response.CustomerResponse;

public class CustomerTransformer {

   public Customer customerRequestToCustomer(CustomerRequest customerRequest){

       Customer customer=Customer.builder()
               .name(customerRequest.getName())
               .age(customerRequest.getAge())
               .address((customerRequest.getAddress()))
               .emailId(customerRequest.getEmailId())
               .gender(customerRequest.getGender())
               .build();

       return customer;
   }

   public CustomerResponse customerToCustomerResponse(Customer customer){
       CustomerResponse response1=CustomerResponse.builder()
               .name(customer.getName())
               .emailId(customer.getEmailId())
               .build();

       return response1;
   }
}
