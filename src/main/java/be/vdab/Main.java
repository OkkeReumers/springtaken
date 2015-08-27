package be.vdab;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import be.vdab.presentation.PersoonViewer;

// enkele imports ...
public class Main {
	public static void main(String[] args) throws IOException {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"dao.xml", "services.xml", "presentation.xml")) {
			context.getBean(PersoonViewer.class).afbeelden();
		}
	}
}