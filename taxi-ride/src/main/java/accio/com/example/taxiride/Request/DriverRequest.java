package accio.com.example.taxiride.Request;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DriverRequest {

    String name;

    int age;

    String panNumber;

    String mobNo;

   CabRequest cab;

}
