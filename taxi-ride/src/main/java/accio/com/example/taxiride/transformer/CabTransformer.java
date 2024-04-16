package accio.com.example.taxiride.transformer;


import accio.com.example.taxiride.Models.Cab;
import accio.com.example.taxiride.dto.Request.CabRequest;

public class CabTransformer {
    public Cab cabToTransformer(CabRequest cabRequest){
        return Cab.builder()
                .company(cabRequest.getCompany())
                .cabNo(cabRequest.getCabNo())
                .carModel(cabRequest.getCarModel())
                .farePerKm(cabRequest.getFarePerKm())
                .numberOfSeat(cabRequest.getNumberOfSeat())
                .carType(cabRequest.getCarType())
                .build();
    }
}
