package accio.com.example.taxiride.Service;

import accio.com.example.taxiride.Models.Driver;
import accio.com.example.taxiride.Repository.DriverRepository;
import accio.com.example.taxiride.Request.DriverRequest;
import accio.com.example.taxiride.transformer.DriverTransformer;
import org.springframework.stereotype.Service;

@Service
public class DriverService {

    public final DriverRepository driverRepository;

    DriverService(DriverRepository driverRepository){this.driverRepository=driverRepository;
    }


    private DriverTransformer driverTransformer=new DriverTransformer();
    public String addDriver(DriverRequest driverRequest){

      Driver driver=driverTransformer.driverToTransformer(driverRequest);



      driverRepository.save(driver);

      return "Driver and Cab saved successfully";
    }
}
