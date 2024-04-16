package accio.com.example.taxiride.Controller;

import accio.com.example.taxiride.Enums.Gender;
import accio.com.example.taxiride.dto.Request.CustomerRequest;
import accio.com.example.taxiride.dto.Response.CustomerResponse;
import accio.com.example.taxiride.Service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")

public class CustomerController {

   private final CustomerService customerService;

   CustomerController(CustomerService customerService){this.customerService=customerService;
   }

   @PostMapping("/api/addCustomer")
   public ResponseEntity<CustomerResponse> addCustomer(@RequestBody CustomerRequest customerRequest){

      CustomerResponse response=customerService.addCustomer(customerRequest);

      return new ResponseEntity<>(response, HttpStatus.CREATED);
   }

   @GetMapping ("/gender/{gender}/age/{age}")
   public ResponseEntity<List<CustomerResponse>> getCustomerAgeandGender(@PathVariable("gender")Gender gender,
                                                                     @PathVariable("age")int age){

      List<CustomerResponse>responses=customerService.getCustomerAgeandGender(gender,age);

      return new ResponseEntity<>(responses,HttpStatus.FOUND);
   }

}
