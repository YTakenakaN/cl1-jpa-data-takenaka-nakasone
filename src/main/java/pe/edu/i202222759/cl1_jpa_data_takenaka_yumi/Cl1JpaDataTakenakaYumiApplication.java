package pe.edu.i202222759.cl1_jpa_data_takenaka_yumi;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pe.edu.i202222759.cl1_jpa_data_takenaka_yumi.entity.CountryLanguageId;
import pe.edu.i202222759.cl1_jpa_data_takenaka_yumi.entity.country;
import pe.edu.i202222759.cl1_jpa_data_takenaka_yumi.repository.CountryRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@SpringBootApplication
public class Cl1JpaDataTakenakaYumiApplication implements CommandLineRunner {

	@Autowired
	CountryRepository countryRepository;

	public static void main(String[] args) {
		SpringApplication.run(Cl1JpaDataTakenakaYumiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		/**
		 * ifPresentOrElse()
*/

		Optional <country> optionalCountryArg = countryRepository.findById("ARG");
		Optional<country> optionalCountryPer = countryRepository.findById("PER");


		optionalCountryArg.ifPresentOrElse(
				country -> {
		 		country CountryARG = optionalCountryArg.get();
		 		CountryARG.getCountrylanguages().forEach(countrylanguage -> System.out.println("Idiomas de Argentina: " +countrylanguage.getLanguage()));
				},
				() -> {
					country CountryPER = optionalCountryPer.get();
					CountryPER.getCountrylanguages().forEach(countrylanguage -> System.out.println("Idiomas de Perú: "+ countrylanguage.getLanguage()));
				}
		);



		/**
		 * deleteAllById()


		List<String> listaPaises= List.of("COL","ARG");

		//valida la existencia de los paises, si existe los mantiene en la lista
		listaPaises.stream().filter((item)->{
			return countryRepository.existsById(item);
		}).collect(Collectors.toList());

		countryRepository.deleteAllById(listaPaises);
		 */
	}


}
