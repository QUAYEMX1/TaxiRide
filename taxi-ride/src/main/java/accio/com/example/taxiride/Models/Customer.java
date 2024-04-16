package accio.com.example.taxiride.Models;

import accio.com.example.taxiride.Enums.Gender;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder

public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String name;

    int age;

    @Column(unique = true,nullable = false)
    String emailId;

    String address;

    @Enumerated(value = EnumType.STRING)
    Gender gender;

    @OneToMany(mappedBy = "customer",cascade =CascadeType.ALL)
    List<TripBooking> bookingList=new ArrayList<>();

}
