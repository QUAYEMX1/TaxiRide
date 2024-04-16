package accio.com.example.taxiride.dto.Request;

import accio.com.example.taxiride.Enums.Gender;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CustomerRequest {

    String name;
    int age;
    String emailId;
    String address;
    Gender gender;

}
