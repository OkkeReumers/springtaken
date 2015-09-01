package be.vdab;

import java.io.IOException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import be.vdab.dao.CreateDAOBeans;
import be.vdab.presentation.CreatePresentationBeans;
import be.vdab.presentation.PersoonViewer;
import be.vdab.services.CreateServiceBeans;

// enkele imports ...
public class Main {
	public static void main(String[] args) throws IOException {
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				CreateDAOBeans.class, CreateServiceBeans.class,
				CreatePresentationBeans.class)) {
			context.getBean(PersoonViewer.class).afbeelden();
		}
	}
}