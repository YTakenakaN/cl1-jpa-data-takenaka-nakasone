package pe.edu.i202222759.cl1_jpa_data_takenaka_yumi.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@IdClass(CountryLanguageId.class)
public class countrylanguage {

    @Id
    @ManyToOne
    @JoinColumn(name = "CountryCode")
    private country CountryCode;

    @Id
    private String Language;
    private String IsOfficial;
    private int Percentage;


}
