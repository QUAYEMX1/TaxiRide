package accio.com.example.taxiride.Controller;

import accio.com.example.taxiride.Request.CustomerRequest;
import accio.com.example.taxiride.Response.CustomerResponse;
import accio.com.example.taxiride.Service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
