package accio.com.example.taxiride.Models;

import accio.com.example.taxiride.Enums.CarType;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class Cab {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String company;

    @Column(unique = true,nullable = false)
    String cabNo;

    String carModel;

    @Enumerated(value = EnumType.STRING)
    CarType carType;

    int numberOfSeat;

    double farePerKm;

    @OneToOne
    @JoinColumn
    Driver driver;

}
