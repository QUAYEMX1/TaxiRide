package accio.com.example.taxiride.transformer;

import accio.com.example.taxiride.Models.Cab;
import accio.com.example.taxiride.Models.Driver;
import accio.com.example.taxiride.dto.Request.DriverRequest;

public class DriverTransformer {

    private CabTransformer cabTransformer=new CabTransformer();
    public Driver driverToTransformer(DriverRequest driverRequest){

        Cab cab=cabTransformer.cabToTransformer(driverRequest.getCab());


        Driver driver= Driver.builder()
                .name(driverRequest.getName())
                .age(driverRequest.getAge())
                .panNumber(driverRequest.getPanNumber())
                .mobNo(driverRequest.getMobNo())
                .rating(0)
                .cab(cab)
                .build();

        cab.setDriver(driver);
        return driver;
    }
}
