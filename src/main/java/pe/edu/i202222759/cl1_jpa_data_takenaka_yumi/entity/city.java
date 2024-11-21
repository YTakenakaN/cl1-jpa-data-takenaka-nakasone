package pe.edu.i202222759.cl1_jpa_data_takenaka_yumi.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class city {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    private String Name;
    private String District;
    private int Population;

    @ManyToOne
    @JoinColumn(name = "CountryCode")
    private country CountryCode;

}
