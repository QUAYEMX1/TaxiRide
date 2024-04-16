package accio.com.example.taxiride.Models;

import accio.com.example.taxiride.Enums.TripStatus;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

public class TripBooking {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    String id;

    String source;

    String destination;

    double tripDistanceInKm;

    double totalFare;

    @Enumerated(value = EnumType.STRING)
    TripStatus tripStatus;

    @CreationTimestamp
    Date bookedAt;

    @ManyToOne
    @JoinColumn
    Driver driver;

    @ManyToOne
    @JoinColumn
    Customer customer;

}
