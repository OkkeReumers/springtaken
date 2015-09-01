package be.vdab.dao; // enkele imports ...

import java.io.File;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:dao.properties")
public class CreateDAOBeans {
	@Value("${persoonDAOCSV}")
	File csvFile;
	@Value("${persoonDAOTXT}")
	File txtFile;

	@Bean
	@Qualifier("CSVFormaat")
	public PersoonDAO persoonDAOCSV() {
		return new PersoonDAOCSV(csvFile);
	}

	@Bean
	@Qualifier("MeerdereRegelsFormaat")
	public PersoonDAO persoonDAOMeerdereRegels() {
		return new PersoonDAOMeerdereRegels(txtFile);
	}
}