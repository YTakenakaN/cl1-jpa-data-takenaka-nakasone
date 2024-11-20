package pe.edu.i202222759.cl1_jpa_data_takenaka_yumi.entity;

import java.io.Serializable;
import java.util.Objects;

public class CountryLanguageId {


    private String CountryCode; // Debe coincidir con el tipo y nombre de la entidad principal
    private String Language;

    // Constructor vacío (necesario para JPA)
    public CountryLanguageId() {}

    // Constructor con parámetros
    public CountryLanguageId(String CountryCode, String Language) {
        this.CountryCode = CountryCode;
        this.Language = Language;
    }

    // Getters y Setters
    public String getCountryCode() {
        return CountryCode;
    }

    public void setCountryCode(String CountryCode) {
        this.CountryCode = CountryCode;
    }

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String Language) {
        this.Language = Language;
    }

    // equals: compara objetos basándose en CountryCode y Language
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CountryLanguageId that = (CountryLanguageId) o;
        return Objects.equals(CountryCode, that.CountryCode) &&
                Objects.equals(Language, that.Language);
    }

    // hashCode: genera un hash único para objetos que tienen el mismo CountryCode y Language
    @Override
    public int hashCode() {
        return Objects.hash(CountryCode, Language);
    }

}
