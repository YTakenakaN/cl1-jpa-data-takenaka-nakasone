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
public class country {

    @Id
    private String Code;
    private String Name;
    private String Continent;
    private String Region;
    private int SurfaceArea;
    private int IndepYear;
    private int Population;
    private int LifeExpectancy;
    private int GNP;
    private int GNPOld;
    private String LocalName;
    private String GovernmentForm;
    private String HeadOfState;
    private int Capital;
    private String Code2;

    @OneToMany (mappedBy = "CountryCode",cascade = CascadeType.PERSIST)
    private List<city> cities;

    @OneToMany (mappedBy = "CountryCode",cascade = CascadeType.PERSIST)
    private List<countrylanguage> countrylanguages;
}
