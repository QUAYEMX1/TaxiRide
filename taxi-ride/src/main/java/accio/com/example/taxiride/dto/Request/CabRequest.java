package accio.com.example.taxiride.dto.Request;

import accio.com.example.taxiride.Enums.CarType;
import lombok.*;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CabRequest {

    String company;

    String carModel;

    String cabNo;

    CarType carType;

    int numberOfSeat;

    double farePerKm;

}
