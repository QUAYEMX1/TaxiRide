package accio.com.example.taxiride.Controller;

import accio.com.example.taxiride.Request.DriverRequest;
import accio.com.example.taxiride.Service.DriverService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/driver")
public class DriverController {

    public final DriverService driverService;

    DriverController(DriverService driverService){this.driverService=driverService;
    }

   @PostMapping("api/adddriver")
    public ResponseEntity<String> addDriver(@RequestBody DriverRequest driverRequest){

       String response=driverService.addDriver(driverRequest);

       return new ResponseEntity<>(response, HttpStatus.CREATED);
   }
}
